package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MitigationActionIdentifier extends StObject {
  
  /**
    * The IAM role ARN used to apply this mitigation action.
    */
  var actionArn: js.UndefOr[MitigationActionArn] = js.undefined
  
  /**
    * The friendly name of the mitigation action.
    */
  var actionName: js.UndefOr[MitigationActionName] = js.undefined
  
  /**
    * The date when this mitigation action was created.
    */
  var creationDate: js.UndefOr[Timestamp] = js.undefined
}
object MitigationActionIdentifier {
  
  @scala.inline
  def apply(): MitigationActionIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MitigationActionIdentifier]
  }
  
  @scala.inline
  implicit class MitigationActionIdentifierMutableBuilder[Self <: MitigationActionIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionArn(value: MitigationActionArn): Self = StObject.set(x, "actionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionArnUndefined: Self = StObject.set(x, "actionArn", js.undefined)
    
    @scala.inline
    def setActionName(value: MitigationActionName): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionNameUndefined: Self = StObject.set(x, "actionName", js.undefined)
    
    @scala.inline
    def setCreationDate(value: Timestamp): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
  }
}
