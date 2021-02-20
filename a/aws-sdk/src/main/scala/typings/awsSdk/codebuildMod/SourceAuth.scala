package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceAuth extends StObject {
  
  /**
    * The resource value that applies to the specified authorization type.
    */
  var resource: js.UndefOr[String] = js.native
  
  /**
    *   This data type is deprecated and is no longer accurate or used.   The authorization type to use. The only valid value is OAUTH, which represents the OAuth authorization type.
    */
  var `type`: SourceAuthType = js.native
}
object SourceAuth {
  
  @scala.inline
  def apply(`type`: SourceAuthType): SourceAuth = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceAuth]
  }
  
  @scala.inline
  implicit class SourceAuthMutableBuilder[Self <: SourceAuth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setType(value: SourceAuthType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
