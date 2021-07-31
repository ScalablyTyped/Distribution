package typings.breeze.breeze

import typings.breeze.breeze.core.EnumSymbol
import typings.breeze.breeze.core.IEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergeStrategy
  extends StObject
     with IEnum {
  
  var Disallowed: MergeStrategySymbol
  
  var OverwriteChanges: MergeStrategySymbol
  
  var PreserveChanges: MergeStrategySymbol
  
  var SkipMerge: MergeStrategySymbol
}
object MergeStrategy {
  
  @scala.inline
  def apply(
    Disallowed: MergeStrategySymbol,
    OverwriteChanges: MergeStrategySymbol,
    PreserveChanges: MergeStrategySymbol,
    SkipMerge: MergeStrategySymbol,
    contains: js.Any => Boolean,
    fromName: String => EnumSymbol,
    getNames: () => js.Array[String],
    getSymbols: () => js.Array[EnumSymbol]
  ): MergeStrategy = {
    val __obj = js.Dynamic.literal(Disallowed = Disallowed.asInstanceOf[js.Any], OverwriteChanges = OverwriteChanges.asInstanceOf[js.Any], PreserveChanges = PreserveChanges.asInstanceOf[js.Any], SkipMerge = SkipMerge.asInstanceOf[js.Any], contains = js.Any.fromFunction1(contains), fromName = js.Any.fromFunction1(fromName), getNames = js.Any.fromFunction0(getNames), getSymbols = js.Any.fromFunction0(getSymbols))
    __obj.asInstanceOf[MergeStrategy]
  }
  
  @scala.inline
  implicit class MergeStrategyMutableBuilder[Self <: MergeStrategy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisallowed(value: MergeStrategySymbol): Self = StObject.set(x, "Disallowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwriteChanges(value: MergeStrategySymbol): Self = StObject.set(x, "OverwriteChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveChanges(value: MergeStrategySymbol): Self = StObject.set(x, "PreserveChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipMerge(value: MergeStrategySymbol): Self = StObject.set(x, "SkipMerge", value.asInstanceOf[js.Any])
  }
}
