package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonPrefix extends StObject {
  
  /**
    * Container for the specified common prefix.
    */
  var Prefix: js.UndefOr[typings.awsSdk.s3Mod.Prefix] = js.undefined
}
object CommonPrefix {
  
  @scala.inline
  def apply(): CommonPrefix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonPrefix]
  }
  
  @scala.inline
  implicit class CommonPrefixMutableBuilder[Self <: CommonPrefix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
  }
}
