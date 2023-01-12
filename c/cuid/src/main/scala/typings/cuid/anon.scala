package typings.cuid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait IsCuid extends StObject {
    
    /**
      * Check if string is a valid 'cuid'.
      *
      * @param cuid: string to check if it is a 'cuid'.
      */
    def isCuid(cuid: String): Boolean
    
    /**
      * Check if string is a valid 'cuid' slug.
      *
      * @param slug: string to check if it is a 'cuid' slug.
      */
    def isSlug(slug: String): Boolean
    
    /**
      * Create a shorter unique collision-resistant ID. Is 7 to 10 characters in length.
      */
    def slug(): String
  }
  object IsCuid {
    
    inline def apply(isCuid: String => Boolean, isSlug: String => Boolean, slug: () => String): IsCuid = {
      val __obj = js.Dynamic.literal(isCuid = js.Any.fromFunction1(isCuid), isSlug = js.Any.fromFunction1(isSlug), slug = js.Any.fromFunction0(slug))
      __obj.asInstanceOf[IsCuid]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsCuid] (val x: Self) extends AnyVal {
      
      inline def setIsCuid(value: String => Boolean): Self = StObject.set(x, "isCuid", js.Any.fromFunction1(value))
      
      inline def setIsSlug(value: String => Boolean): Self = StObject.set(x, "isSlug", js.Any.fromFunction1(value))
      
      inline def setSlug(value: () => String): Self = StObject.set(x, "slug", js.Any.fromFunction0(value))
    }
  }
}
