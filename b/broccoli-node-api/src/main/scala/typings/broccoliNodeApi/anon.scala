package typings.broccoliNodeApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CachePath extends StObject {
    
    var cachePath: js.UndefOr[String] = js.native
    
    var inputPaths: js.Array[String] = js.native
    
    var outputPath: String = js.native
  }
  object CachePath {
    
    @scala.inline
    def apply(inputPaths: js.Array[String], outputPath: String): CachePath = {
      val __obj = js.Dynamic.literal(inputPaths = inputPaths.asInstanceOf[js.Any], outputPath = outputPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[CachePath]
    }
    
    @scala.inline
    implicit class CachePathMutableBuilder[Self <: CachePath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCachePath(value: String): Self = StObject.set(x, "cachePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCachePathUndefined: Self = StObject.set(x, "cachePath", js.undefined)
      
      @scala.inline
      def setInputPaths(value: js.Array[String]): Self = StObject.set(x, "inputPaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPathsVarargs(value: String*): Self = StObject.set(x, "inputPaths", js.Array(value :_*))
      
      @scala.inline
      def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
    }
  }
}
