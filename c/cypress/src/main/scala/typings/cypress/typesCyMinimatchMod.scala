package typings.cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCyMinimatchMod {
  
  @JSImport("cypress/types/cy-minimatch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def minimatch(target: String, pattern: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("minimatch")(target.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def minimatch(target: String, pattern: String, options: MinimatchOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("minimatch")(target.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait MinimatchOptions extends StObject {
    
    /**
      * Dump a ton of stuff to stderr.
      *
      * @default false
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allow patterns to match filenames starting with a period,
      * even if the pattern does not explicitly have a period in that spot.
      *
      * @default false
      */
    var dot: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Returns from negate expressions the same as if they were not negated.
      * (Ie, true on a hit, false on a miss.)
      *
      * @default false
      */
    var flipNegate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set, then patterns without slashes will be matched against
      * the basename of the path if it contains slashes.
      *
      * @default false
      */
    var matchBase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Do not expand {a,b} and {1..3} brace sets.
      *
      * @default false
      */
    var nobrace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Perform a case-insensitive match.
      *
      * @default false
      */
    var nocase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Suppress the behavior of treating #
      * at the start of a pattern as a comment.
      *
      * @default false
      */
    var nocomment: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable "extglob" style patterns like +(a|b).
      *
      * @default false
      */
    var noext: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable ** matching against multiple folder names.
      *
      * @default false
      */
    var noglobstar: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Suppress the behavior of treating a leading ! character as negation.
      *
      * @default false
      */
    var nonegate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When a match is not found by minimatch.match,
      * return a list containing the pattern itself if this option is set.
      * Otherwise, an empty list is returned if there are no matches.
      *
      * @default false
      */
    var nonull: js.UndefOr[Boolean] = js.undefined
  }
  object MinimatchOptions {
    
    inline def apply(): MinimatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MinimatchOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MinimatchOptions] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      inline def setFlipNegate(value: Boolean): Self = StObject.set(x, "flipNegate", value.asInstanceOf[js.Any])
      
      inline def setFlipNegateUndefined: Self = StObject.set(x, "flipNegate", js.undefined)
      
      inline def setMatchBase(value: Boolean): Self = StObject.set(x, "matchBase", value.asInstanceOf[js.Any])
      
      inline def setMatchBaseUndefined: Self = StObject.set(x, "matchBase", js.undefined)
      
      inline def setNobrace(value: Boolean): Self = StObject.set(x, "nobrace", value.asInstanceOf[js.Any])
      
      inline def setNobraceUndefined: Self = StObject.set(x, "nobrace", js.undefined)
      
      inline def setNocase(value: Boolean): Self = StObject.set(x, "nocase", value.asInstanceOf[js.Any])
      
      inline def setNocaseUndefined: Self = StObject.set(x, "nocase", js.undefined)
      
      inline def setNocomment(value: Boolean): Self = StObject.set(x, "nocomment", value.asInstanceOf[js.Any])
      
      inline def setNocommentUndefined: Self = StObject.set(x, "nocomment", js.undefined)
      
      inline def setNoext(value: Boolean): Self = StObject.set(x, "noext", value.asInstanceOf[js.Any])
      
      inline def setNoextUndefined: Self = StObject.set(x, "noext", js.undefined)
      
      inline def setNoglobstar(value: Boolean): Self = StObject.set(x, "noglobstar", value.asInstanceOf[js.Any])
      
      inline def setNoglobstarUndefined: Self = StObject.set(x, "noglobstar", js.undefined)
      
      inline def setNonegate(value: Boolean): Self = StObject.set(x, "nonegate", value.asInstanceOf[js.Any])
      
      inline def setNonegateUndefined: Self = StObject.set(x, "nonegate", js.undefined)
      
      inline def setNonull(value: Boolean): Self = StObject.set(x, "nonull", value.asInstanceOf[js.Any])
      
      inline def setNonullUndefined: Self = StObject.set(x, "nonull", js.undefined)
    }
  }
}
