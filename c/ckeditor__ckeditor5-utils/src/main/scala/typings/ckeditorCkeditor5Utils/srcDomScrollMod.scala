package typings.ckeditorCkeditor5Utils

import typings.ckeditorCkeditor5Utils.anon.AlignToTop
import typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsBooleans.`true`
import typings.std.HTMLElement
import typings.std.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDomScrollMod {
  
  @JSImport("@ckeditor/ckeditor5-utils/src/dom/scroll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def scrollAncestorsToShowTarget(target: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollAncestorsToShowTarget")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def scrollAncestorsToShowTarget(target: HTMLElement, ancestorOffset: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollAncestorsToShowTarget")(target.asInstanceOf[js.Any], ancestorOffset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def scrollAncestorsToShowTarget(target: Range): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollAncestorsToShowTarget")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def scrollAncestorsToShowTarget(target: Range, ancestorOffset: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollAncestorsToShowTarget")(target.asInstanceOf[js.Any], ancestorOffset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def scrollViewportToShowTarget[T /* <: Boolean */, U /* <: IfTrue[T] */](param0: AlignToTop[T, U]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollViewportToShowTarget")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends true ? true : never
    }}}
    */
  type IfTrue[T] = `true`
}
