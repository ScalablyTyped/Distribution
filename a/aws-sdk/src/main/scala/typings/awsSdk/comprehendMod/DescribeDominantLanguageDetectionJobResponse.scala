package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDominantLanguageDetectionJobResponse extends js.Object {
  
  /**
    * An object that contains the properties associated with a dominant language detection job.
    */
  var DominantLanguageDetectionJobProperties: js.UndefOr[typings.awsSdk.comprehendMod.DominantLanguageDetectionJobProperties] = js.native
}
object DescribeDominantLanguageDetectionJobResponse {
  
  @scala.inline
  def apply(): DescribeDominantLanguageDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDominantLanguageDetectionJobResponse]
  }
  
  @scala.inline
  implicit class DescribeDominantLanguageDetectionJobResponseOps[Self <: DescribeDominantLanguageDetectionJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDominantLanguageDetectionJobProperties(value: DominantLanguageDetectionJobProperties): Self = this.set("DominantLanguageDetectionJobProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDominantLanguageDetectionJobProperties: Self = this.set("DominantLanguageDetectionJobProperties", js.undefined)
  }
}
