package typings.connectMongo

import typings.connectMongo.anon.Baz
import typings.connectMongo.anon.Foo
import typings.connectMongo.anon.PartialConnectMongoOption
import typings.connectMongo.anon.Store
import typings.expressSession.mod.Cookie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testHelperMod {
  
  @JSImport("connect-mongo/build/main/test/testHelper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createStoreHelper(): Store = ^.asInstanceOf[js.Dynamic].applyDynamic("createStoreHelper")().asInstanceOf[Store]
  inline def createStoreHelper(opt: PartialConnectMongoOption): Store = ^.asInstanceOf[js.Dynamic].applyDynamic("createStoreHelper")(opt.asInstanceOf[js.Any]).asInstanceOf[Store]
  
  inline def makeCookie(): Cookie = ^.asInstanceOf[js.Dynamic].applyDynamic("makeCookie")().asInstanceOf[Cookie]
  
  inline def makeData(): Baz = ^.asInstanceOf[js.Dynamic].applyDynamic("makeData")().asInstanceOf[Baz]
  
  inline def makeDataNoCookie(): Foo = ^.asInstanceOf[js.Dynamic].applyDynamic("makeDataNoCookie")().asInstanceOf[Foo]
}
