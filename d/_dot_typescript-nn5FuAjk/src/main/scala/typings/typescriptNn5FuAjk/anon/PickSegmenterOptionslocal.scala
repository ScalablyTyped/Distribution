package typings.typescriptNn5FuAjk.anon

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.`best fit`
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.lookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined .typescript-nn5FuAjk.Pick<.typescript-nn5FuAjk.Intl.SegmenterOptions, 'localeMatcher'> */
trait PickSegmenterOptionslocal extends StObject {
  
  var localeMatcher: js.UndefOr[(`best fit`) | lookup] = js.undefined
}
object PickSegmenterOptionslocal {
  
  inline def apply(): PickSegmenterOptionslocal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickSegmenterOptionslocal]
  }
  
  extension [Self <: PickSegmenterOptionslocal](x: Self) {
    
    inline def setLocaleMatcher(value: (`best fit`) | lookup): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
    inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
  }
}
