package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExperimentSource extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the source.
    */
  var SourceArn: ExperimentSourceArn = js.native
  
  /**
    * The source type.
    */
  var SourceType: js.UndefOr[typings.awsSdk.sagemakerMod.SourceType] = js.native
}
object ExperimentSource {
  
  @scala.inline
  def apply(SourceArn: ExperimentSourceArn): ExperimentSource = {
    val __obj = js.Dynamic.literal(SourceArn = SourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExperimentSource]
  }
  
  @scala.inline
  implicit class ExperimentSourceMutableBuilder[Self <: ExperimentSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceArn(value: ExperimentSourceArn): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceType(value: SourceType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
  }
}
