package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContinuousBackupsOutput extends StObject {
  
  /**
    * Represents the continuous backups and point in time recovery settings on the table.
    */
  var ContinuousBackupsDescription: js.UndefOr[typings.awsSdk.dynamodbMod.ContinuousBackupsDescription] = js.undefined
}
object UpdateContinuousBackupsOutput {
  
  @scala.inline
  def apply(): UpdateContinuousBackupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateContinuousBackupsOutput]
  }
  
  @scala.inline
  implicit class UpdateContinuousBackupsOutputMutableBuilder[Self <: UpdateContinuousBackupsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContinuousBackupsDescription(value: ContinuousBackupsDescription): Self = StObject.set(x, "ContinuousBackupsDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuousBackupsDescriptionUndefined: Self = StObject.set(x, "ContinuousBackupsDescription", js.undefined)
  }
}
