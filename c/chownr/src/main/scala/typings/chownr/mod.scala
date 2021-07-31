package typings.chownr

import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(path: PathLike, uid: Double, gid: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("chownr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def sync(path: PathLike, uid: Double, gid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type PathLike = String | Buffer | URL_
}
