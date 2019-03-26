package typings
package bullLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Opts
  extends org.scalablytyped.runtime.Instantiable1[/* queueName */ java.lang.String, bullLib.bullMod.BullNs.Queue[js.Object]]
     with org.scalablytyped.runtime.Instantiable3[
      /* queueName */ java.lang.String, 
      /* url */ java.lang.String, 
      /* opts */ bullLib.bullMod.BullNs.QueueOptions, 
      bullLib.bullMod.BullNs.Queue[js.Object]
    ]
     with org.scalablytyped.runtime.Instantiable2[
      /* queueName */ java.lang.String, 
      (/* opts */ bullLib.bullMod.BullNs.QueueOptions) | (/* url */ java.lang.String), 
      bullLib.bullMod.BullNs.Queue[js.Object]
    ] {
  /* tslint:disable:no-unnecessary-generics unified-signatures */
  def apply[T](queueName: java.lang.String): bullLib.bullMod.BullNs.Queue[T] = js.native
  def apply[T](queueName: java.lang.String, opts: bullLib.bullMod.BullNs.QueueOptions): bullLib.bullMod.BullNs.Queue[T] = js.native
  def apply[T](queueName: java.lang.String, url: java.lang.String): bullLib.bullMod.BullNs.Queue[T] = js.native
  def apply[T](queueName: java.lang.String, url: java.lang.String, opts: bullLib.bullMod.BullNs.QueueOptions): bullLib.bullMod.BullNs.Queue[T] = js.native
}

