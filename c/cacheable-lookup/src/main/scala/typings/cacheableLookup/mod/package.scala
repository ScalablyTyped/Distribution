package typings.cacheableLookup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AsyncResolver = typings.node.dnsMod.promises.Resolver
  
  type TPromise[T] = T | js.Promise[T]
}
