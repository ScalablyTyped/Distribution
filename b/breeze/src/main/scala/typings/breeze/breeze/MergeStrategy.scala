package typings.breeze.breeze

import typings.breeze.breeze.core.EnumSymbol
import typings.breeze.breeze.core.IEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MergeStrategy extends IEnum {
  
  var Disallowed: MergeStrategySymbol = js.native
  
  var OverwriteChanges: MergeStrategySymbol = js.native
  
  var PreserveChanges: MergeStrategySymbol = js.native
  
  var SkipMerge: MergeStrategySymbol = js.native
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
  implicit class MergeStrategyOps[Self <: MergeStrategy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisallowed(value: MergeStrategySymbol): Self = this.set("Disallowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwriteChanges(value: MergeStrategySymbol): Self = this.set("OverwriteChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveChanges(value: MergeStrategySymbol): Self = this.set("PreserveChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipMerge(value: MergeStrategySymbol): Self = this.set("SkipMerge", value.asInstanceOf[js.Any])
  }
}
