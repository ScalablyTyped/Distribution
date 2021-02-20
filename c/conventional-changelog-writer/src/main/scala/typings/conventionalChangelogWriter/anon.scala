package typings.conventionalChangelogWriter

import typings.conventionalCommitsParser.mod.Commit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Raw[T /* <: Commit[String | Double | js.Symbol] */] extends StObject {
    
    var raw: T = js.native
  }
  object Raw {
    
    @scala.inline
    def apply[T /* <: Commit[String | Double | js.Symbol] */](raw: T): Raw[T] = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[Raw[T]]
    }
    
    @scala.inline
    implicit class RawMutableBuilder[Self <: Raw[_], T /* <: Commit[String | Double | js.Symbol] */] (val x: Self with Raw[T]) extends AnyVal {
      
      @scala.inline
      def setRaw(value: T): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
}
