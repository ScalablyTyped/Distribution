package typings.characterParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait End extends StObject {
    
    val end: js.UndefOr[Double] = js.undefined
    
    val start: js.UndefOr[Double] = js.undefined
  }
  object End {
    
    inline def apply(): End = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[End]
    }
    
    extension [Self <: End](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  trait IgnoreLineComment extends StObject {
    
    val ignoreLineComment: js.UndefOr[Boolean] = js.undefined
  }
  object IgnoreLineComment {
    
    inline def apply(): IgnoreLineComment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IgnoreLineComment]
    }
    
    extension [Self <: IgnoreLineComment](x: Self) {
      
      inline def setIgnoreLineComment(value: Boolean): Self = StObject.set(x, "ignoreLineComment", value.asInstanceOf[js.Any])
      
      inline def setIgnoreLineCommentUndefined: Self = StObject.set(x, "ignoreLineComment", js.undefined)
    }
  }
  
  trait IgnoreNesting extends StObject {
    
    val end: js.UndefOr[Double] = js.undefined
    
    val ignoreLineComment: js.UndefOr[Boolean] = js.undefined
    
    val ignoreNesting: js.UndefOr[Boolean] = js.undefined
    
    val start: js.UndefOr[Double] = js.undefined
  }
  object IgnoreNesting {
    
    inline def apply(): IgnoreNesting = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IgnoreNesting]
    }
    
    extension [Self <: IgnoreNesting](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setIgnoreLineComment(value: Boolean): Self = StObject.set(x, "ignoreLineComment", value.asInstanceOf[js.Any])
      
      inline def setIgnoreLineCommentUndefined: Self = StObject.set(x, "ignoreLineComment", js.undefined)
      
      inline def setIgnoreNesting(value: Boolean): Self = StObject.set(x, "ignoreNesting", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNestingUndefined: Self = StObject.set(x, "ignoreNesting", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  trait Src extends StObject {
    
    var end: Double
    
    var src: String
    
    var start: Double
  }
  object Src {
    
    inline def apply(end: Double, src: String, start: Double): Src = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Src]
    }
    
    extension [Self <: Src](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
