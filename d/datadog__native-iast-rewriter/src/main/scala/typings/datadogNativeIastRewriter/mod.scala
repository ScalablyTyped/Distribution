package typings.datadogNativeIastRewriter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@datadog/native-iast-rewriter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@datadog/native-iast-rewriter", "Rewriter")
  @js.native
  open class Rewriter () extends StObject {
    def this(config: RewriterConfig) = this()
    
    def csiMethods(): js.Array[String] = js.native
    
    def rewrite(code: String, file: String): ResultWithoutMetrics = js.native
  }
  
  inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
  
  trait CsiMethod extends StObject {
    
    var dst: js.UndefOr[String] = js.undefined
    
    var operator: js.UndefOr[Boolean] = js.undefined
    
    var src: String
  }
  object CsiMethod {
    
    inline def apply(src: String): CsiMethod = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[CsiMethod]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CsiMethod] (val x: Self) extends AnyVal {
      
      inline def setDst(value: String): Self = StObject.set(x, "dst", value.asInstanceOf[js.Any])
      
      inline def setDstUndefined: Self = StObject.set(x, "dst", js.undefined)
      
      inline def setOperator(value: Boolean): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResultWithoutMetrics extends StObject {
    
    var content: String
  }
  object ResultWithoutMetrics {
    
    inline def apply(content: String): ResultWithoutMetrics = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultWithoutMetrics]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResultWithoutMetrics] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
  
  trait RewriterConfig extends StObject {
    
    var chainSourceMap: js.UndefOr[Boolean] = js.undefined
    
    var comments: js.UndefOr[Boolean] = js.undefined
    
    var csiMethods: js.UndefOr[js.Array[CsiMethod]] = js.undefined
    
    var localVarPrefix: js.UndefOr[String] = js.undefined
  }
  object RewriterConfig {
    
    inline def apply(): RewriterConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RewriterConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RewriterConfig] (val x: Self) extends AnyVal {
      
      inline def setChainSourceMap(value: Boolean): Self = StObject.set(x, "chainSourceMap", value.asInstanceOf[js.Any])
      
      inline def setChainSourceMapUndefined: Self = StObject.set(x, "chainSourceMap", js.undefined)
      
      inline def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      inline def setCsiMethods(value: js.Array[CsiMethod]): Self = StObject.set(x, "csiMethods", value.asInstanceOf[js.Any])
      
      inline def setCsiMethodsUndefined: Self = StObject.set(x, "csiMethods", js.undefined)
      
      inline def setCsiMethodsVarargs(value: CsiMethod*): Self = StObject.set(x, "csiMethods", js.Array(value*))
      
      inline def setLocalVarPrefix(value: String): Self = StObject.set(x, "localVarPrefix", value.asInstanceOf[js.Any])
      
      inline def setLocalVarPrefixUndefined: Self = StObject.set(x, "localVarPrefix", js.undefined)
    }
  }
}
