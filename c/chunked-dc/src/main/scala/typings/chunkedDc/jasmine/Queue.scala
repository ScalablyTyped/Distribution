package typings.chunkedDc.jasmine

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Queue
  extends StObject
     with Instantiable1[/* env */ js.Any, js.Any] {
  
  var abort: Boolean = js.native
  
  def add(block: js.Any): Unit = js.native
  def add(block: js.Any, ensure: Boolean): Unit = js.native
  
  def addBefore(block: Block): Unit = js.native
  def addBefore(block: Block, ensure: Boolean): Unit = js.native
  
  var blocks: js.Array[Block] = js.native
  
  var ensured: js.Array[Boolean] = js.native
  
  var env: Env = js.native
  
  var index: Double = js.native
  
  def insertNext(block: js.Any): Unit = js.native
  def insertNext(block: js.Any, ensure: Boolean): Unit = js.native
  
  def isRunning(): Boolean = js.native
  
  def next_(): Unit = js.native
  
  var offset: Double = js.native
  
  def results(): NestedResults = js.native
  
  var running: Boolean = js.native
  
  def start(): Unit = js.native
  def start(onComplete: js.Function0[Unit]): Unit = js.native
}
