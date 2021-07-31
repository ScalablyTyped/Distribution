package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawString extends StObject {
  
  /**
    * The YAML-formatted or JSON-formatted revision string. It includes information about which Lambda function to update and optional Lambda functions that validate deployment lifecycle events.
    */
  var content: js.UndefOr[RawStringContent] = js.undefined
  
  /**
    * The SHA256 hash value of the revision content.
    */
  var sha256: js.UndefOr[RawStringSha256] = js.undefined
}
object RawString {
  
  @scala.inline
  def apply(): RawString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RawString]
  }
  
  @scala.inline
  implicit class RawStringMutableBuilder[Self <: RawString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: RawStringContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setSha256(value: RawStringSha256): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
  }
}
