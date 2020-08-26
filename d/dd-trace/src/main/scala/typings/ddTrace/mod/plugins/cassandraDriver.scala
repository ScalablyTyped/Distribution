package typings.ddTrace.mod.plugins

import typings.ddTrace.mod.Analyzable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This plugin automatically instruments the
  * [cassandra-driver](https://github.com/datastax/nodejs-driver) module.
  */
@js.native
trait cassandraDriver
  extends Integration
     with Analyzable

object cassandraDriver {
  @scala.inline
  def apply(): cassandraDriver = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[cassandraDriver]
  }
}

