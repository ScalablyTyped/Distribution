package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an UriToLinesMapping. */
@js.native
trait IUriToLinesMapping extends js.Object {
  
  /** UriToLinesMapping absolutePath */
  var absolutePath: js.UndefOr[String | Null] = js.native
  
  /** UriToLinesMapping lines */
  var lines: js.UndefOr[
    (js.Array[
      Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ _)
    ]) | Null
  ] = js.native
}
object IUriToLinesMapping {
  
  @scala.inline
  def apply(): IUriToLinesMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUriToLinesMapping]
  }
  
  @scala.inline
  implicit class IUriToLinesMappingOps[Self <: IUriToLinesMapping] (val x: Self) extends AnyVal {
    
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
    def setAbsolutePath(value: String): Self = this.set("absolutePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbsolutePath: Self = this.set("absolutePath", js.undefined)
    
    @scala.inline
    def setAbsolutePathNull: Self = this.set("absolutePath", null)
    
    @scala.inline
    def setLinesVarargs(value: (Double | js.Any)*): Self = this.set("lines", js.Array(value :_*))
    
    @scala.inline
    def setLines(
      value: js.Array[
          Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ _)
        ]
    ): Self = this.set("lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLines: Self = this.set("lines", js.undefined)
    
    @scala.inline
    def setLinesNull: Self = this.set("lines", null)
  }
}
