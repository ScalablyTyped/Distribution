package typings.ddTrace.profileMod.perftools.profiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Profile. */
@js.native
trait IProfile extends js.Object {
  
  /** Profile comment */
  var comment: js.UndefOr[
    (js.Array[
      Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ _)
    ]) | Null
  ] = js.native
  
  /** Profile defaultSampleType */
  var defaultSampleType: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.native
  
  /** Profile dropFrames */
  var dropFrames: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.native
  
  /** Profile durationNanos */
  var durationNanos: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.native
  
  /** Profile function */
  var function: js.UndefOr[js.Array[IFunction] | Null] = js.native
  
  /** Profile keepFrames */
  var keepFrames: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.native
  
  /** Profile location */
  var location: js.UndefOr[js.Array[ILocation] | Null] = js.native
  
  /** Profile mapping */
  var mapping: js.UndefOr[js.Array[IMapping] | Null] = js.native
  
  /** Profile period */
  var period: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.native
  
  /** Profile periodType */
  var periodType: js.UndefOr[IValueType | Null] = js.native
  
  /** Profile sample */
  var sample: js.UndefOr[js.Array[ISample] | Null] = js.native
  
  /** Profile sampleType */
  var sampleType: js.UndefOr[js.Array[IValueType] | Null] = js.native
  
  /** Profile stringTable */
  var stringTable: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** Profile timeNanos */
  var timeNanos: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.native
}
object IProfile {
  
  @scala.inline
  def apply(): IProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProfile]
  }
  
  @scala.inline
  implicit class IProfileOps[Self <: IProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCommentVarargs(value: (Double | js.Any)*): Self = this.set("comment", js.Array(value :_*))
    
    @scala.inline
    def setComment(
      value: js.Array[
          Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ _)
        ]
    ): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setCommentNull: Self = this.set("comment", null)
    
    @scala.inline
    def setDefaultSampleType(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
    ): Self = this.set("defaultSampleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSampleType: Self = this.set("defaultSampleType", js.undefined)
    
    @scala.inline
    def setDefaultSampleTypeNull: Self = this.set("defaultSampleType", null)
    
    @scala.inline
    def setDropFrames(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
    ): Self = this.set("dropFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropFrames: Self = this.set("dropFrames", js.undefined)
    
    @scala.inline
    def setDropFramesNull: Self = this.set("dropFrames", null)
    
    @scala.inline
    def setDurationNanos(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
    ): Self = this.set("durationNanos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationNanos: Self = this.set("durationNanos", js.undefined)
    
    @scala.inline
    def setDurationNanosNull: Self = this.set("durationNanos", null)
    
    @scala.inline
    def setFunctionVarargs(value: IFunction*): Self = this.set("function", js.Array(value :_*))
    
    @scala.inline
    def setFunction(value: js.Array[IFunction]): Self = this.set("function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunction: Self = this.set("function", js.undefined)
    
    @scala.inline
    def setFunctionNull: Self = this.set("function", null)
    
    @scala.inline
    def setKeepFrames(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
    ): Self = this.set("keepFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepFrames: Self = this.set("keepFrames", js.undefined)
    
    @scala.inline
    def setKeepFramesNull: Self = this.set("keepFrames", null)
    
    @scala.inline
    def setLocationVarargs(value: ILocation*): Self = this.set("location", js.Array(value :_*))
    
    @scala.inline
    def setLocation(value: js.Array[ILocation]): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setLocationNull: Self = this.set("location", null)
    
    @scala.inline
    def setMappingVarargs(value: IMapping*): Self = this.set("mapping", js.Array(value :_*))
    
    @scala.inline
    def setMapping(value: js.Array[IMapping]): Self = this.set("mapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapping: Self = this.set("mapping", js.undefined)
    
    @scala.inline
    def setMappingNull: Self = this.set("mapping", null)
    
    @scala.inline
    def setPeriod(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
    ): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    
    @scala.inline
    def setPeriodNull: Self = this.set("period", null)
    
    @scala.inline
    def setPeriodType(value: IValueType): Self = this.set("periodType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriodType: Self = this.set("periodType", js.undefined)
    
    @scala.inline
    def setPeriodTypeNull: Self = this.set("periodType", null)
    
    @scala.inline
    def setSampleVarargs(value: ISample*): Self = this.set("sample", js.Array(value :_*))
    
    @scala.inline
    def setSample(value: js.Array[ISample]): Self = this.set("sample", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSample: Self = this.set("sample", js.undefined)
    
    @scala.inline
    def setSampleNull: Self = this.set("sample", null)
    
    @scala.inline
    def setSampleTypeVarargs(value: IValueType*): Self = this.set("sampleType", js.Array(value :_*))
    
    @scala.inline
    def setSampleType(value: js.Array[IValueType]): Self = this.set("sampleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleType: Self = this.set("sampleType", js.undefined)
    
    @scala.inline
    def setSampleTypeNull: Self = this.set("sampleType", null)
    
    @scala.inline
    def setStringTableVarargs(value: String*): Self = this.set("stringTable", js.Array(value :_*))
    
    @scala.inline
    def setStringTable(value: js.Array[String]): Self = this.set("stringTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringTable: Self = this.set("stringTable", js.undefined)
    
    @scala.inline
    def setStringTableNull: Self = this.set("stringTable", null)
    
    @scala.inline
    def setTimeNanos(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
    ): Self = this.set("timeNanos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeNanos: Self = this.set("timeNanos", js.undefined)
    
    @scala.inline
    def setTimeNanosNull: Self = this.set("timeNanos", null)
  }
}
