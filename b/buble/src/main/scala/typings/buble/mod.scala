package typings.buble

import typings.buble.anon.Arrow
import typings.buble.anon.Chrome
import typings.magicString.mod.SourceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("buble", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transform(content: String): TransformOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(content.asInstanceOf[js.Any]).asInstanceOf[TransformOutput]
  inline def transform(content: String, options: TransformOptions): TransformOutput = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TransformOutput]
  
  trait TransformOptions extends StObject {
    
    // input
    var file: js.UndefOr[String] = js.undefined
    
    // output
    var includeContent: js.UndefOr[Boolean] = js.undefined
    
    // custom JSX pragma (https://buble.surge.sh/guide/#jsx)
    var jsx: js.UndefOr[String] = js.undefined
    
    // others
    var namedFunctionExpressions: js.UndefOr[Boolean] = js.undefined
    
    // default: 'React.createElement'
    // custom `Object.assign` (https://buble.surge.sh/guide/#object-spread-and-rest)
    var objectAssign: js.UndefOr[String | Boolean] = js.undefined
    
    // used for sourcemaps
    var source: js.UndefOr[String] = js.undefined
    
    // source: https://github.com/Rich-Harris/buble/blob/master/src/support.js
    var target: js.UndefOr[Chrome] = js.undefined
    
    // transforms
    var transforms: js.UndefOr[Arrow] = js.undefined
  }
  object TransformOptions {
    
    inline def apply(): TransformOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransformOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransformOptions] (val x: Self) extends AnyVal {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setIncludeContent(value: Boolean): Self = StObject.set(x, "includeContent", value.asInstanceOf[js.Any])
      
      inline def setIncludeContentUndefined: Self = StObject.set(x, "includeContent", js.undefined)
      
      inline def setJsx(value: String): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
      
      inline def setJsxUndefined: Self = StObject.set(x, "jsx", js.undefined)
      
      inline def setNamedFunctionExpressions(value: Boolean): Self = StObject.set(x, "namedFunctionExpressions", value.asInstanceOf[js.Any])
      
      inline def setNamedFunctionExpressionsUndefined: Self = StObject.set(x, "namedFunctionExpressions", js.undefined)
      
      inline def setObjectAssign(value: String | Boolean): Self = StObject.set(x, "objectAssign", value.asInstanceOf[js.Any])
      
      inline def setObjectAssignUndefined: Self = StObject.set(x, "objectAssign", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setTarget(value: Chrome): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTransforms(value: Arrow): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
      
      inline def setTransformsUndefined: Self = StObject.set(x, "transforms", js.undefined)
    }
  }
  
  trait TransformOutput extends StObject {
    
    var code: String
    
    var map: SourceMap
  }
  object TransformOutput {
    
    inline def apply(code: String, map: SourceMap): TransformOutput = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransformOutput] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMap(value: SourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    }
  }
}
