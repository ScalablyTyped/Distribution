package typings.beanstalkdWorker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type JobPollHandler = js.Function1[/* state */ typings.beanstalkd.mod.BeanstalkdJobState, js.Any]
  
  type JobStatus = typings.beanstalkd.mod.BeanstalkdJobState | typings.beanstalkdWorker.beanstalkdWorkerStrings.success
  
  type TubeHandler = js.ThisFunction1[
    /* this */ typings.beanstalkdWorker.mod.WatcherJob, 
    /* payload */ js.UndefOr[js.Any], 
    js.Any
  ]
}
