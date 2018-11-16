package typings
package davLib.davMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dav", "request")
@js.native
object requestNs extends js.Object {
  
  trait AddressBookQueryOptions extends js.Object {
    /**
             * value for Depth header.
             */
    var depth: js.UndefOr[java.lang.String] = js.undefined
    /**
             * list of props to request.
             */
    var props: js.Array[js.Object]
  }
  
  
  trait BasicOptions extends js.Object {
    /**
             * put request body.
             */
    var data: java.lang.String
    /**
             * cached calendar object etag.
             */
    var etag: java.lang.String
    /**
             * http method.
             */
    var method: java.lang.String
  }
  
  
  trait CalendarQueryOptions extends js.Object {
    /**
             * value for Depth header.
             */
    var depth: js.UndefOr[java.lang.String] = js.undefined
    /**
             * list of filters to send with request.
             */
    var filters: js.Array[js.Object]
    /**
             * list of props to request.
             */
    var props: js.Array[js.Object]
    /**
             * VTIMEZONE calendar object.
             */
    var timezone: java.lang.String
  }
  
  
  trait PropfindOptions extends js.Object {
    /**
             *  value for Depth header.
             */
    var depth: js.UndefOr[java.lang.String] = js.undefined
    /**
             * list of props to request.
             */
    var props: js.Array[js.Object]
  }
  
  
  trait SyncCollectionOptions extends js.Object {
    /**
             * option value for Depth header.
             */
    var depth: js.UndefOr[java.lang.String] = js.undefined
    /**
             * list of props to request.
             */
    var props: js.Array[js.Object]
    /**
             * indicates scope of the sync report request.
             */
    var syncLevel: scala.Double
    /**
             * synchronization token provided by the server.
             */
    var syncToken: java.lang.String
  }
  
  /**
       *
       * @param options
       * @returns
       */
  def addressBookQuery(options: AddressBookQueryOptions): java.lang.String = js.native
  /**
       *
       * @param options
       * @returns
       */
  def basic(options: BasicOptions): davLib.davMod.Request = js.native
  /**
       *
       * @param options
       * @returns
       */
  def calendarQuery(options: CalendarQueryOptions): java.lang.String = js.native
  /**
       *
       * @param options
       * @returns
       */
  def propfind(options: PropfindOptions): java.lang.String = js.native
  /**
       *
       * @param options
       * @returns
       */
  def syncCollection(options: SyncCollectionOptions): java.lang.String = js.native
}

