package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrialComponentSource extends StObject {
  
  /**
    * The source ARN.
    */
  var SourceArn: TrialComponentSourceArn = js.native
  
  /**
    * The source job type.
    */
  var SourceType: js.UndefOr[typings.awsSdk.sagemakerMod.SourceType] = js.native
}
object TrialComponentSource {
  
  @scala.inline
  def apply(SourceArn: TrialComponentSourceArn): TrialComponentSource = {
    val __obj = js.Dynamic.literal(SourceArn = SourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrialComponentSource]
  }
  
  @scala.inline
  implicit class TrialComponentSourceMutableBuilder[Self <: TrialComponentSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceArn(value: TrialComponentSourceArn): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceType(value: SourceType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
  }
}
