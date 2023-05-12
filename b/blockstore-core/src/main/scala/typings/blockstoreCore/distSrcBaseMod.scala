package typings.blockstoreCore

import typings.interfaceBlockstore.mod.Blockstore
import typings.interfaceBlockstore.mod.Pair
import typings.interfaceStore.mod.AbortOptions
import typings.interfaceStore.mod.Await
import typings.interfaceStore.mod.AwaitIterable
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBaseMod {
  
  @JSImport("blockstore-core/dist/src/base", "BaseBlockstore")
  @js.native
  open class BaseBlockstore ()
    extends StObject
       with Blockstore[js.Object, js.Object, js.Object, js.Object, js.Object, js.Object, js.Object, js.Object] {
    
    def delete(key: CID[Any, Double, Double, Version], options: AbortOptions): js.Promise[Unit] = js.native
    
    def deleteMany(source: AwaitIterable[CID[Any, Double, Double, Version]], options: AbortOptions): AwaitIterable[CID[Any, Double, Double, Version]] = js.native
    
    def get(key: CID[Any, Double, Double, Version], options: AbortOptions): Await[js.typedarray.Uint8Array] = js.native
    
    def getAll(options: AbortOptions): AwaitIterable[Pair] = js.native
    
    def getMany(source: AwaitIterable[CID[Any, Double, Double, Version]], options: AbortOptions): AwaitIterable[Pair] = js.native
    
    def has(key: CID[Any, Double, Double, Version], options: AbortOptions): Await[Boolean] = js.native
    
    def put(key: CID[Any, Double, Double, Version], `val`: js.typedarray.Uint8Array, options: AbortOptions): Await[CID[Any, Double, Double, Version]] = js.native
    
    def putMany(source: AwaitIterable[Pair], options: AbortOptions): AwaitIterable[CID[Any, Double, Double, Version]] = js.native
  }
}
