package typings.chalk.mod

import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChalkFunction extends js.Object {
  def apply(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  def apply(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
}

