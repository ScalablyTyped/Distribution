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
  
  inline def apply[T](): Props[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props[T]]
  }
  
  extension [Self <: Props[?], T](x: Self & Props[T]) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setRef(value: LegacyRef[T]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ T | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
