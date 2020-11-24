package typings.bonjour.mod

import typings.node.eventsMod.global.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Service
  extends BaseService
     with EventEmitter {
  
  var addresses: js.Array[String] = js.native
  
  var published: Boolean = js.native
  
  def start(): Unit = js.native
  
  def stop(): Unit = js.native
  def stop(cb: js.Function0[Unit]): Unit = js.native
}
