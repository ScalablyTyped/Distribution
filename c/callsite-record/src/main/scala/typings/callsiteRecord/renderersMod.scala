package typings.callsiteRecord

import typings.callsiteRecord.anon.Comment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderersMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.callsiteRecord.renderersMod.RendererWithoutSyntax
    - typings.callsiteRecord.renderersMod.RendererWithSyntax
  */
  trait Renderer extends StObject
  object Renderer {
    
    inline def RendererWithSyntax(
      codeFrame: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof identity */ Any,
      codeLine: (Double, String, String, Boolean) => String,
      stack: String => String,
      stackLine: (String, String, Boolean) => String,
      syntax: Comment
    ): typings.callsiteRecord.renderersMod.RendererWithSyntax = {
      val __obj = js.Dynamic.literal(codeFrame = codeFrame.asInstanceOf[js.Any], codeLine = js.Any.fromFunction4(codeLine), stack = js.Any.fromFunction1(stack), stackLine = js.Any.fromFunction3(stackLine), syntax = syntax.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.callsiteRecord.renderersMod.RendererWithSyntax]
    }
    
    inline def RendererWithoutSyntax(
      codeFrame: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof identity */ Any,
      codeLine: (Double, String, String, Boolean) => String,
      stack: String => String,
      stackLine: (String, String, Boolean) => String
    ): typings.callsiteRecord.renderersMod.RendererWithoutSyntax = {
      val __obj = js.Dynamic.literal(codeFrame = codeFrame.asInstanceOf[js.Any], codeLine = js.Any.fromFunction4(codeLine), stack = js.Any.fromFunction1(stack), stackLine = js.Any.fromFunction3(stackLine))
      __obj.asInstanceOf[typings.callsiteRecord.renderersMod.RendererWithoutSyntax]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.callsiteRecord.renderersMod.Renderer because Already inherited */ trait RendererWithSyntax
    extends StObject
       with RendererWithoutSyntax {
    
    var syntax: Comment
  }
  object RendererWithSyntax {
    
    inline def apply(
      codeFrame: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof identity */ Any,
      codeLine: (Double, String, String, Boolean) => String,
      stack: String => String,
      stackLine: (String, String, Boolean) => String,
      syntax: Comment
    ): RendererWithSyntax = {
      val __obj = js.Dynamic.literal(codeFrame = codeFrame.asInstanceOf[js.Any], codeLine = js.Any.fromFunction4(codeLine), stack = js.Any.fromFunction1(stack), stackLine = js.Any.fromFunction3(stackLine), syntax = syntax.asInstanceOf[js.Any])
      __obj.asInstanceOf[RendererWithSyntax]
    }
    
    extension [Self <: RendererWithSyntax](x: Self) {
      
      inline def setSyntax(value: Comment): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    }
  }
  
  trait RendererWithoutSyntax
    extends StObject
       with Renderer {
    
    var codeFrame: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof identity */ Any
    
    def codeLine(num: Double, base: String, src: String, isLast: Boolean): String
    
    def stack(stack: String): String
    
    def stackLine(name: String, location: String, isLast: Boolean): String
  }
  object RendererWithoutSyntax {
    
    inline def apply(
      codeFrame: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof identity */ Any,
      codeLine: (Double, String, String, Boolean) => String,
      stack: String => String,
      stackLine: (String, String, Boolean) => String
    ): RendererWithoutSyntax = {
      val __obj = js.Dynamic.literal(codeFrame = codeFrame.asInstanceOf[js.Any], codeLine = js.Any.fromFunction4(codeLine), stack = js.Any.fromFunction1(stack), stackLine = js.Any.fromFunction3(stackLine))
      __obj.asInstanceOf[RendererWithoutSyntax]
    }
    
    extension [Self <: RendererWithoutSyntax](x: Self) {
      
      inline def setCodeFrame(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof identity */ Any): Self = StObject.set(x, "codeFrame", value.asInstanceOf[js.Any])
      
      inline def setCodeLine(value: (Double, String, String, Boolean) => String): Self = StObject.set(x, "codeLine", js.Any.fromFunction4(value))
      
      inline def setStack(value: String => String): Self = StObject.set(x, "stack", js.Any.fromFunction1(value))
      
      inline def setStackLine(value: (String, String, Boolean) => String): Self = StObject.set(x, "stackLine", js.Any.fromFunction3(value))
    }
  }
  
  trait Renderers extends StObject {
    
    var default: RendererWithSyntax
    
    var html: RendererWithSyntax
    
    var noColor: RendererWithoutSyntax
  }
  object Renderers {
    
    inline def apply(default: RendererWithSyntax, html: RendererWithSyntax, noColor: RendererWithoutSyntax): Renderers = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], noColor = noColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Renderers]
    }
    
    extension [Self <: Renderers](x: Self) {
      
      inline def setDefault(value: RendererWithSyntax): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setHtml(value: RendererWithSyntax): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setNoColor(value: RendererWithoutSyntax): Self = StObject.set(x, "noColor", value.asInstanceOf[js.Any])
    }
  }
}
