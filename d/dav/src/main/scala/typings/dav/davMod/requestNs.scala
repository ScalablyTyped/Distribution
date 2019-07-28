package typings.dav.davMod

import typings.dav.davMod.requestNs.AddressBookQueryOptions
import typings.dav.davMod.requestNs.BasicOptions
import typings.dav.davMod.requestNs.CalendarQueryOptions
import typings.dav.davMod.requestNs.PropfindOptions
import typings.dav.davMod.requestNs.SyncCollectionOptions
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
    var depth: js.UndefOr[String] = js.undefined
    /**
      * list of props to request.
      */
    var props: js.Array[js.Object]
  }
  
  trait BasicOptions extends js.Object {
    /**
      * put request body.
      */
    var data: String
    /**
      * cached calendar object etag.
      */
    var etag: String
    /**
      * http method.
      */
    var method: String
  }
  
  trait CalendarQueryOptions extends js.Object {
    /**
      * value for Depth header.
      */
    var depth: js.UndefOr[String] = js.undefined
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
    var timezone: String
  }
  
  trait PropfindOptions extends js.Object {
    /**
      *  value for Depth header.
      */
    var depth: js.UndefOr[String] = js.undefined
    /**
      * list of props to request.
      */
    var props: js.Array[js.Object]
  }
  
  trait SyncCollectionOptions extends js.Object {
    /**
      * option value for Depth header.
      */
    var depth: js.UndefOr[String] = js.undefined
    /**
      * list of props to request.
      */
    var props: js.Array[js.Object]
    /**
      * indicates scope of the sync report request.
      */
    var syncLevel: Double
    /**
      * synchronization token provided by the server.
      */
    var syncToken: String
  }
  
  /**
    *
    * @param options
    * @returns
    */
  def addressBookQuery(options: AddressBookQueryOptions): String = js.native
  /**
    *
    * @param options
    * @returns
    */
  def basic(options: BasicOptions): Request = js.native
  /**
    *
    * @param options
    * @returns
    */
  def calendarQuery(options: CalendarQueryOptions): String = js.native
  /**
    *
    * @param options
    * @returns
    */
  def propfind(options: PropfindOptions): String = js.native
  /**
    *
    * @param options
    * @returns
    */
  def syncCollection(options: SyncCollectionOptions): String = js.native
}

