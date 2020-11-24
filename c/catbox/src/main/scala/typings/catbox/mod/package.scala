package typings.catbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type EnginePrototypeOrObject = typings.catbox.mod.EnginePrototype[js.Any] | typings.catbox.mod.ClientApi[js.Any]
  
  type GenerateFunc[T] = js.Function2[
    /* id */ typings.catbox.mod.Id, 
    /* flags */ typings.catbox.mod.GenerateFuncFlags, 
    js.Promise[T]
  ]
  
  type Id = java.lang.String | typings.catbox.anon.Id
}
