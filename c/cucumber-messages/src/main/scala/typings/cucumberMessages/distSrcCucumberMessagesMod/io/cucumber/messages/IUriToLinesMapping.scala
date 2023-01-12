package typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an UriToLinesMapping. */
trait IUriToLinesMapping extends StObject {
  
  /** UriToLinesMapping absolutePath */
  var absolutePath: js.UndefOr[String | Null] = js.undefined
  
  /** UriToLinesMapping lines */
  var lines: js.UndefOr[
    (js.Array[
      Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
    ]) | Null
  ] = js.undefined
}
object IUriToLinesMapping {
  
  inline def apply(): IUriToLinesMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUriToLinesMapping]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IUriToLinesMapping] (val x: Self) extends AnyVal {
    
    inline def setAbsolutePath(value: String): Self = StObject.set(x, "absolutePath", value.asInstanceOf[js.Any])
    
    inline def setAbsolutePathNull: Self = StObject.set(x, "absolutePath", null)
    
    inline def setAbsolutePathUndefined: Self = StObject.set(x, "absolutePath", js.undefined)
    
    inline def setLines(
      value: js.Array[
          Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
        ]
    ): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesNull: Self = StObject.set(x, "lines", null)
    
    inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
    
    inline def setLinesVarargs(
      value: (Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any))*
    ): Self = StObject.set(x, "lines", js.Array(value*))
  }
}
