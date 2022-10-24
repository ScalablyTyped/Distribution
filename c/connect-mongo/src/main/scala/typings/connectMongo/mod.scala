package typings.connectMongo

import typings.connectMongo.buildMainLibMongoStoreMod.ConnectMongoOptions
import typings.connectMongo.buildMainLibMongoStoreMod.MongoStore
import typings.connectMongo.buildMainLibMongoStoreMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object mod {
  
  @JSImport("connect-mongo", JSImport.Namespace)
  @js.native
  open class ^ protected () extends default {
    def this(param0: ConnectMongoOptions) = this()
  }
  @JSImport("connect-mongo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(options: ConnectMongoOptions): MongoStore = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[MongoStore]
}
