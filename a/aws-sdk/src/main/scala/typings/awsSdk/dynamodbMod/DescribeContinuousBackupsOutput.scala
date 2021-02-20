package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeContinuousBackupsOutput extends StObject {
  
  /**
    * Represents the continuous backups and point in time recovery settings on the table.
    */
  var ContinuousBackupsDescription: js.UndefOr[typings.awsSdk.dynamodbMod.ContinuousBackupsDescription] = js.native
}
object DescribeContinuousBackupsOutput {
  
  @scala.inline
  def apply(): DescribeContinuousBackupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeContinuousBackupsOutput]
  }
  
  @scala.inline
  implicit class DescribeContinuousBackupsOutputMutableBuilder[Self <: DescribeContinuousBackupsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContinuousBackupsDescription(value: ContinuousBackupsDescription): Self = StObject.set(x, "ContinuousBackupsDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuousBackupsDescriptionUndefined: Self = StObject.set(x, "ContinuousBackupsDescription", js.undefined)
  }
}
