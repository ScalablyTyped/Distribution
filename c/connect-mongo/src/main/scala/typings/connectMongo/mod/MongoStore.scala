package typings.connectMongo.mod

import typings.expressSession.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("connect-mongo", "MongoStore")
@js.native
class MongoStore () extends Store {
  
  @JSName("clear")
  def clear_MMongoStore(): Unit = js.native
  @JSName("clear")
  def clear_MMongoStore(callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
  
  def close(): Unit = js.native
  
  @JSName("length")
  def length_MMongoStore(callback: js.Function2[/* err */ js.Any, /* length */ Double, Unit]): Unit = js.native
  
  def set(
    sid: String,
    session: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Express.SessionData */ js.Any
  ): Unit = js.native
  def set(
    sid: String,
    session: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Express.SessionData */ js.Any,
    callback: js.Function1[/* err */ js.Any, Unit]
  ): Unit = js.native
  
  @JSName("touch")
  def touch_MMongoStore(
    sid: String,
    session: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Express.SessionData */ js.Any
  ): Unit = js.native
  @JSName("touch")
  def touch_MMongoStore(
    sid: String,
    session: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Express.SessionData */ js.Any,
    callback: js.Function1[/* err */ js.Any, Unit]
  ): Unit = js.native
}
