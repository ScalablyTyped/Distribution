package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityProfileSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the security profile.
    */
  var Arn: js.UndefOr[ARN] = js.native
  
  /**
    * The identifier of the security profile.
    */
  var Id: js.UndefOr[SecurityProfileId] = js.native
  
  /**
    * The name of the security profile.
    */
  var Name: js.UndefOr[SecurityProfileName] = js.native
}
object SecurityProfileSummary {
  
  @scala.inline
  def apply(): SecurityProfileSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityProfileSummary]
  }
  
  @scala.inline
  implicit class SecurityProfileSummaryMutableBuilder[Self <: SecurityProfileSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setId(value: SecurityProfileId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: SecurityProfileName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
