package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
@js.native
trait MIDIOutput
  extends StObject
     with MIDIPort {
  
  def send(data: Array[Double]): Unit = js.native
  def send(data: Array[Double], timestamp: DOMHighResTimeStamp): Unit = js.native
  def send(data: Iterable[Double]): Unit = js.native
  def send(data: Iterable[Double], timestamp: DOMHighResTimeStamp): Unit = js.native
}
