package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an UriToLinesMapping. */
@js.native
trait IUriToLinesMapping extends StObject {
  
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
  implicit class IUriToLinesMappingMutableBuilder[Self <: IUriToLinesMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbsolutePath(value: String): Self = StObject.set(x, "absolutePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsolutePathNull: Self = StObject.set(x, "absolutePath", null)
    
    @scala.inline
    def setAbsolutePathUndefined: Self = StObject.set(x, "absolutePath", js.undefined)
    
    @scala.inline
    def setLines(
      value: js.Array[
          Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ _)
        ]
    ): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesNull: Self = StObject.set(x, "lines", null)
    
    @scala.inline
    def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
    
    @scala.inline
    def setLinesVarargs(value: (Double | js.Any)*): Self = StObject.set(x, "lines", js.Array(value :_*))
  }
}
