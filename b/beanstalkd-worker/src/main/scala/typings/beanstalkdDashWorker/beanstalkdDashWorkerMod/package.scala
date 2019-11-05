package typings.beanstalkdDashWorker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object beanstalkdDashWorkerMod {
  import typings.beanstalkd.beanstalkdMod.BeanstalkdJobState
  import typings.beanstalkdDashWorker.beanstalkdDashWorkerStrings.success

  type JobPollHandler = js.Function1[/* state */ BeanstalkdJobState, js.Any]
  type JobStatus = BeanstalkdJobState | success
  type TubeHandler = js.ThisFunction1[/* this */ WatcherJob, /* payload */ js.UndefOr[js.Any], js.Any]
}
