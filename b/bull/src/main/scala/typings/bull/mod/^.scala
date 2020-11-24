package typings.bull.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bull", JSImport.Namespace)
@js.native
class ^[T] protected () extends Queue[T] {
  def this(queueName: String) = this()
  def this(queueName: String, opts: QueueOptions) = this()
  def this(queueName: String, url: String) = this()
  def this(queueName: String, url: String, opts: QueueOptions) = this()
}
@JSImport("bull", JSImport.Namespace)
@js.native
object ^
  extends TopLevel[
      (Instantiable1[/* queueName */ String, Queue[js.Object]]) with (Instantiable2[/* queueName */ String, /* opts */ QueueOptions, Queue[js.Object]]) with (Instantiable2[/* queueName */ String, /* url */ String, Queue[js.Object]]) with (Instantiable3[/* queueName */ String, /* url */ String, /* opts */ QueueOptions, Queue[js.Object]])
    ] {
  
  /* tslint:disable:no-unnecessary-generics unified-signatures */
  def apply[T](queueName: String): Queue[T] = js.native
  def apply[T](queueName: String, opts: QueueOptions): Queue[T] = js.native
  def apply[T](queueName: String, url: String): Queue[T] = js.native
  def apply[T](queueName: String, url: String, opts: QueueOptions): Queue[T] = js.native
}
