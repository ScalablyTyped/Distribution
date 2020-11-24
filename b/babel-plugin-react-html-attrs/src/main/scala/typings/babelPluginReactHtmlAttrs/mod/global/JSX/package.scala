package typings.babelPluginReactHtmlAttrs.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object JSX {
  
  type Element = typings.react.mod.ReactElement
  
  type IntrinsicAttributes = typings.react.mod.Attributes
  
  type IntrinsicClassAttributes[T] = typings.react.mod.ClassAttributes[T]
  
  // We can't recurse forever because `type` can't be self-referential;
  // let's assume it's reasonable to do a single React.lazy() around a single React.memo() / vice-versa
  type LibraryManagedAttributes[C, P] = typings.babelPluginReactHtmlAttrs.mod.ReactManagedAttributes[js.Any | C, P]
}
