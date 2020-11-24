package typings.ddTrace.profileMod.perftools.profiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Mapping. */
@js.native
trait IMapping extends js.Object {
  
  /** Mapping buildId */
  var buildId: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.native
  
  /** Mapping fileOffset */
  var fileOffset: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.native
  
  /** Mapping filename */
  var filename: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.native
  
  /** Mapping hasFilenames */
  var hasFilenames: js.UndefOr[Boolean | Null] = js.native
  
  /** Mapping hasFunctions */
  var hasFunctions: js.UndefOr[Boolean | Null] = js.native
  
  /** Mapping hasInlineFrames */
  var hasInlineFrames: js.UndefOr[Boolean | Null] = js.native
  
  /** Mapping hasLineNumbers */
  var hasLineNumbers: js.UndefOr[Boolean | Null] = js.native
  
  /** Mapping id */
  var id: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.native
  
  /** Mapping memoryLimit */
  var memoryLimit: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.native
  
  /** Mapping memoryStart */
  var memoryStart: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.native
}
object IMapping {
  
  @scala.inline
  def apply(): IMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMapping]
  }
  
  @scala.inline
  implicit class IMappingOps[Self <: IMapping] (val x: Self) extends AnyVal {
    
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
    def setBuildId(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
    ): Self = this.set("buildId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildId: Self = this.set("buildId", js.undefined)
    
    @scala.inline
    def setBuildIdNull: Self = this.set("buildId", null)
    
    @scala.inline
    def setFileOffset(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
    ): Self = this.set("fileOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileOffset: Self = this.set("fileOffset", js.undefined)
    
    @scala.inline
    def setFileOffsetNull: Self = this.set("fileOffset", null)
    
    @scala.inline
    def setFilename(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
    ): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setFilenameNull: Self = this.set("filename", null)
    
    @scala.inline
    def setHasFilenames(value: Boolean): Self = this.set("hasFilenames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasFilenames: Self = this.set("hasFilenames", js.undefined)
    
    @scala.inline
    def setHasFilenamesNull: Self = this.set("hasFilenames", null)
    
    @scala.inline
    def setHasFunctions(value: Boolean): Self = this.set("hasFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasFunctions: Self = this.set("hasFunctions", js.undefined)
    
    @scala.inline
    def setHasFunctionsNull: Self = this.set("hasFunctions", null)
    
    @scala.inline
    def setHasInlineFrames(value: Boolean): Self = this.set("hasInlineFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasInlineFrames: Self = this.set("hasInlineFrames", js.undefined)
    
    @scala.inline
    def setHasInlineFramesNull: Self = this.set("hasInlineFrames", null)
    
    @scala.inline
    def setHasLineNumbers(value: Boolean): Self = this.set("hasLineNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasLineNumbers: Self = this.set("hasLineNumbers", js.undefined)
    
    @scala.inline
    def setHasLineNumbersNull: Self = this.set("hasLineNumbers", null)
    
    @scala.inline
    def setId(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
    ): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    
    @scala.inline
    def setMemoryLimit(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
    ): Self = this.set("memoryLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemoryLimit: Self = this.set("memoryLimit", js.undefined)
    
    @scala.inline
    def setMemoryLimitNull: Self = this.set("memoryLimit", null)
    
    @scala.inline
    def setMemoryStart(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
    ): Self = this.set("memoryStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemoryStart: Self = this.set("memoryStart", js.undefined)
    
    @scala.inline
    def setMemoryStartNull: Self = this.set("memoryStart", null)
  }
}
