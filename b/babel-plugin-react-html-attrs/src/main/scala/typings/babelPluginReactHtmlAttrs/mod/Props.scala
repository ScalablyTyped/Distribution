package typings.babelPluginReactHtmlAttrs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// Props / DOM Attributes
// ----------------------------------------------------------------------
/**
  * @deprecated. This was used to allow clients to pass `ref` and `key`
  * to `createElement`, which is no longer necessary due to intersection
  * types. If you need to declare a props object before passing it to
  * `createElement` or a factory, use `ClassAttributes<T>`:
  *
  * ```ts
  * var b: Button | null;
  * var props: ButtonProps & ClassAttributes<Button> = {
  *     ref: b => button = b, // ok!
  *     label: "I'm a Button"
  * };
  * ```
  */
trait Props[T] extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var key: js.UndefOr[Key] = js.undefined
  
  var ref: js.UndefOr[LegacyRef[T]] = js.undefined
}
object Props {
  
  @scala.inline
  def apply[T](): Props[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props[T]]
  }
  
  @scala.inline
  implicit class PropsMutableBuilder[Self <: Props[?], T] (val x: Self & Props[T]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenNull: Self = StObject.set(x, "children", null)
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setRef(value: LegacyRef[T]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ T | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
