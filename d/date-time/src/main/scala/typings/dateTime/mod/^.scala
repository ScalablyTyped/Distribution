package typings.dateTime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-time", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
  	Pretty datetime: `2014-01-09 06:46:01`.
  	@example
  	```
  	import dateTime = require('date-time');
  	dateTime();
  	//=> '2017-05-20 17:07:05'
  	dateTime({date: new Date(1989, 2, 4, 10)});
  	//=> '1989-03-04 09:00:00'
  	dateTime({showTimeZone: true});
  	//=> '2017-05-20 17:07:05 UTC+7'
  	dateTime({local: false});
  	//=> '2017-05-20 10:07:05'
  	dateTime({local: false, showTimeZone: true});
  	//=> '2017-05-20 10:07:05 UTC'
  	dateTime({showMilliseconds: true});
  	//=> '2017-05-20 17:07:05 6ms'
  	```
  	*/
  def apply(): String = js.native
  def apply(options: Options): String = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function dateTime(options?: dateTime.Options): string;
  // export = dateTime;
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof dateTime */ js.Any = js.native
}
