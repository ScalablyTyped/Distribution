package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContinuousBackupsOutput extends StObject {
  
  /**
    * <p>Represents the continuous backups and point in time recovery settings on the
    *             table.</p>
    */
  var ContinuousBackupsDescription: js.UndefOr[
    typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ContinuousBackupsDescription
  ] = js.undefined
}
object UpdateContinuousBackupsOutput {
  
  inline def apply(): UpdateContinuousBackupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateContinuousBackupsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateContinuousBackupsOutput] (val x: Self) extends AnyVal {
    
    inline def setContinuousBackupsDescription(value: ContinuousBackupsDescription): Self = StObject.set(x, "ContinuousBackupsDescription", value.asInstanceOf[js.Any])
    
    inline def setContinuousBackupsDescriptionUndefined: Self = StObject.set(x, "ContinuousBackupsDescription", js.undefined)
  }
}
