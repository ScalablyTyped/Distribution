package typings
package cronLib.cronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cron", JSImport.Namespace)
@js.native
object cronModMembers extends js.Object {
  var job: (js.Function7[
    /* cronTime */ java.lang.String | stdLib.Date, 
    /* onTick */ js.Function0[scala.Unit], 
    /* onComplete */ js.UndefOr[js.Function0[scala.Unit]], 
    /* start */ js.UndefOr[scala.Boolean], 
    /* timeZone */ js.UndefOr[java.lang.String], 
    /* context */ js.UndefOr[js.Any], 
    /* runOnInit */ js.UndefOr[scala.Boolean], 
    CronJob
  ]) | (js.Function1[/* options */ CronJobParameters, CronJob]) = js.native
  var sendAt: js.Function1[/* cronTime */ CronTime, stdLib.Date] = js.native
  var time: js.Function2[
    /* source */ java.lang.String | stdLib.Date, 
    /* zone */ js.UndefOr[java.lang.String], 
    CronTime
  ] = js.native
  var timeout: js.Function1[/* cronTime */ CronTime, scala.Double] = js.native
}

