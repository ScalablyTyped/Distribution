package typings
package bullLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Opts
  extends  // tslint:disable-line unified-signatures
org.scalablytyped.runtime.Instantiable1[/* queueName */ java.lang.String, bullLib.bullMod.BullNs.Queue[js.Any]]
     with org.scalablytyped.runtime.Instantiable3[
      /* queueName */ java.lang.String, 
      /* url */ java.lang.String, 
      /* opts */ bullLib.bullMod.BullNs.QueueOptions, 
      bullLib.bullMod.BullNs.Queue[js.Any]
    ]
     with org.scalablytyped.runtime.Instantiable2[
      /* queueName */ java.lang.String, 
      (/* opts */ bullLib.bullMod.BullNs.QueueOptions) | (/* url */ java.lang.String), 
      bullLib.bullMod.BullNs.Queue[js.Any]
    ] {
  def apply(queueName: java.lang.String): bullLib.bullMod.BullNs.Queue[_] = js.native
  def apply(queueName: java.lang.String, opts: bullLib.bullMod.BullNs.QueueOptions): bullLib.bullMod.BullNs.Queue[_] = js.native
  def apply(queueName: java.lang.String, url: java.lang.String): bullLib.bullMod.BullNs.Queue[_] = js.native
  def apply(queueName: java.lang.String, url: java.lang.String, opts: bullLib.bullMod.BullNs.QueueOptions): bullLib.bullMod.BullNs.Queue[_] = js.native
}

