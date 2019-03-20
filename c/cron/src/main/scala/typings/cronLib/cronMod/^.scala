package typings
package cronLib.cronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cron", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var job: (js.Function9[
    /* cronTime */ java.lang.String | stdLib.Date | momentLib.momentMod.momentNs.Moment, 
    /* onTick */ js.Function0[scala.Unit], 
    /* onComplete */ js.UndefOr[CronCommand], 
    /* start */ js.UndefOr[scala.Boolean], 
    /* timeZone */ js.UndefOr[java.lang.String], 
    /* context */ js.UndefOr[js.Any], 
    /* runOnInit */ js.UndefOr[scala.Boolean], 
    /* utcOffset */ js.UndefOr[java.lang.String | scala.Double], 
    /* unrefTimeout */ js.UndefOr[scala.Boolean], 
    CronJob
  ]) | (js.Function1[/* options */ CronJobParameters, CronJob]) = js.native
  var sendAt: js.Function1[
    /* cronTime */ java.lang.String | stdLib.Date | momentLib.momentMod.momentNs.Moment, 
    momentLib.momentMod.momentNs.Moment
  ] = js.native
  var time: js.Function2[
    /* source */ java.lang.String | stdLib.Date | momentLib.momentMod.momentNs.Moment, 
    /* zone */ js.UndefOr[java.lang.String], 
    CronTime
  ] = js.native
  var timeout: js.Function1[
    /* cronTime */ java.lang.String | stdLib.Date | momentLib.momentMod.momentNs.Moment, 
    scala.Double
  ] = js.native
}

