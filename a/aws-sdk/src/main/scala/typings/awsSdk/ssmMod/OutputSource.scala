package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputSource extends StObject {
  
  /**
    * The ID of the output source, for example the URL of an S3 bucket.
    */
  var OutputSourceId: js.UndefOr[typings.awsSdk.ssmMod.OutputSourceId] = js.undefined
  
  /**
    * The type of source where the association execution details are stored, for example, Amazon S3.
    */
  var OutputSourceType: js.UndefOr[typings.awsSdk.ssmMod.OutputSourceType] = js.undefined
}
object OutputSource {
  
  @scala.inline
  def apply(): OutputSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputSource]
  }
  
  @scala.inline
  implicit class OutputSourceMutableBuilder[Self <: OutputSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputSourceId(value: OutputSourceId): Self = StObject.set(x, "OutputSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputSourceIdUndefined: Self = StObject.set(x, "OutputSourceId", js.undefined)
    
    @scala.inline
    def setOutputSourceType(value: OutputSourceType): Self = StObject.set(x, "OutputSourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputSourceTypeUndefined: Self = StObject.set(x, "OutputSourceType", js.undefined)
  }
}
