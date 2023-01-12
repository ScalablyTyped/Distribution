package typings.connectSqlite3

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.connectSqlite3.connectSqlite3Strings.auto
import typings.connectSqlite3.connectSqlite3Strings.lax
import typings.connectSqlite3.connectSqlite3Strings.none
import typings.connectSqlite3.connectSqlite3Strings.strict
import typings.connectSqlite3.mod.connect.ConnectParams
import typings.connectSqlite3.mod.connect.SQLiteStoreInitator
import typings.express.mod.Request_
import typings.node.eventsMod.EventEmitter
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(connect: ConnectParams): SQLiteStoreInitator = ^.asInstanceOf[js.Dynamic].apply(connect.asInstanceOf[js.Any]).asInstanceOf[SQLiteStoreInitator]
  
  @JSImport("connect-sqlite3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object connect {
    
    /* Rewritten from type alias, can be one of: 
      - typings.connectSqlite3.anon.Store
      - typings.connectSqlite3.anon.Session
    */
    trait ConnectParams extends StObject
    object ConnectParams {
      
      inline def Session(session: typings.connectSqlite3.anon.Store): typings.connectSqlite3.anon.Session = {
        val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.connectSqlite3.anon.Session]
      }
      
      inline def Store(Store: Instantiable0[typings.connectSqlite3.mod.connect.Store]): typings.connectSqlite3.anon.Store = {
        val __obj = js.Dynamic.literal(Store = Store.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.connectSqlite3.anon.Store]
      }
    }
    
    trait Cookie
      extends StObject
         with CookieOptions {
      
      /** Returns the original `maxAge` (time-to-live), in milliseconds, of the session cookie. */
      var originalMaxAge: Double
    }
    object Cookie {
      
      inline def apply(originalMaxAge: Double): Cookie = {
        val __obj = js.Dynamic.literal(originalMaxAge = originalMaxAge.asInstanceOf[js.Any])
        __obj.asInstanceOf[Cookie]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Cookie] (val x: Self) extends AnyVal {
        
        inline def setOriginalMaxAge(value: Double): Self = StObject.set(x, "originalMaxAge", value.asInstanceOf[js.Any])
      }
    }
    
    trait CookieOptions extends StObject {
      
      /**
        * Specifies the value for the `Domain Set-Cookie` attribute.
        * By default, no domain is set, and most clients will consider the cookie to apply to only the current domain.
        */
      var domain: js.UndefOr[String] = js.undefined
      
      var encode: js.UndefOr[js.Function1[/* val */ String, String]] = js.undefined
      
      /**
        * Specifies the `Date` object to be the value for the `Expires Set-Cookie` attribute.
        * By default, no expiration is set, and most clients will consider this a "non-persistent cookie" and will delete it on a condition like exiting a web browser application.
        *
        * If both `expires` and `maxAge` are set in the options, then the last one defined in the object is what is used.
        *
        * @deprecated The `expires` option should not be set directly; instead only use the `maxAge` option
        * @see maxAge
        */
      var expires: js.UndefOr[js.Date] = js.undefined
      
      /**
        * Specifies the boolean value for the `HttpOnly Set-Cookie` attribute. When truthy, the `HttpOnly` attribute is set, otherwise it is not.
        * By default, the `HttpOnly` attribute is set.
        *
        * Be careful when setting this to `true`, as compliant clients will not allow client-side JavaScript to see the cookie in `document.cookie`.
        */
      var httpOnly: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Specifies the number (in milliseconds) to use when calculating the `Expires Set-Cookie` attribute.
        * This is done by taking the current server time and adding `maxAge` milliseconds to the value to calculate an `Expires` datetime. By default, no maximum age is set.
        *
        * If both `expires` and `maxAge` are set in the options, then the last one defined in the object is what is used.
        * `maxAge` should be preferred over `expires`.
        *
        * @see expires
        */
      var maxAge: js.UndefOr[Double] = js.undefined
      
      /**
        * Specifies the value for the `Path Set-Cookie` attribute.
        * By default, this is set to '/', which is the root path of the domain.
        */
      var path: js.UndefOr[String] = js.undefined
      
      /**
        * Specifies the boolean or string to be the value for the `SameSite Set-Cookie` attribute.
        * - `true` will set the `SameSite` attribute to `Strict` for strict same site enforcement.
        * - `false` will not set the `SameSite` attribute.
        * - `lax` will set the `SameSite` attribute to `Lax` for lax same site enforcement.
        * - `none` will set the `SameSite` attribute to `None` for an explicit cross-site cookie.
        * - `strict` will set the `SameSite` attribute to `Strict` for strict same site enforcement.
        *
        * More information about the different enforcement levels can be found in the specification.
        *
        * **Note:** This is an attribute that has not yet been fully standardized, and may change in the future.
        * This also means many clients may ignore this attribute until they understand it.
        */
      var sameSite: js.UndefOr[Boolean | lax | strict | none] = js.undefined
      
      /**
        * Specifies the boolean value for the `Secure Set-Cookie` attribute. When truthy, the `Secure` attribute is set, otherwise it is not. By default, the `Secure` attribute is not set.
        * Be careful when setting this to true, as compliant clients will not send the cookie back to the server in the future if the browser does not have an HTTPS connection.
        *
        * Please note that `secure: true` is a **recommended option**.
        * However, it requires an https-enabled website, i.e., HTTPS is necessary for secure cookies.
        * If `secure` is set, and you access your site over HTTP, **the cookie will not be set**.
        *
        * The cookie.secure option can also be set to the special value `auto` to have this setting automatically match the determined security of the connection.
        * Be careful when using this setting if the site is available both as HTTP and HTTPS, as once the cookie is set on HTTPS, it will no longer be visible over HTTP.
        * This is useful when the Express "trust proxy" setting is properly setup to simplify development vs production configuration.
        *
        * If you have your node.js behind a proxy and are using `secure: true`, you need to set "trust proxy" in express. Please see the [README](https://github.com/expressjs/session) for details.
        *
        * Please see the [README](https://github.com/expressjs/session) for an example of using secure cookies in production, but allowing for testing in development based on NODE_ENV.
        */
      var secure: js.UndefOr[Boolean | auto] = js.undefined
      
      var signed: js.UndefOr[Boolean] = js.undefined
    }
    object CookieOptions {
      
      inline def apply(): CookieOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CookieOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: CookieOptions] (val x: Self) extends AnyVal {
        
        inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
        
        inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
        
        inline def setEncode(value: /* val */ String => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
        
        inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
        
        inline def setExpires(value: js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
        
        inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
        
        inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
        
        inline def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
        
        inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
        
        inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        inline def setSameSite(value: Boolean | lax | strict | none): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
        
        inline def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
        
        inline def setSecure(value: Boolean | auto): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
        
        inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
        
        inline def setSigned(value: Boolean): Self = StObject.set(x, "signed", value.asInstanceOf[js.Any])
        
        inline def setSignedUndefined: Self = StObject.set(x, "signed", js.undefined)
      }
    }
    
    @js.native
    trait SQLiteStore extends Store
    
    @js.native
    trait SQLiteStoreInitator
      extends StObject
         with Instantiable0[SQLiteStore]
         with Instantiable1[/* options */ SQLiteStoreOptions, SQLiteStore]
    
    trait SQLiteStoreOptions extends StObject {
      
      /**
        * Enables [WAL](https://www.sqlite.org/wal.html) mode (defaults to false)
        * @default "false"
        */
      var concurrentDB: js.UndefOr[String] = js.undefined
      
      /**
        * Database file name
        * @default "sessionsDB"
        */
      var db: js.UndefOr[String] = js.undefined
      
      /**
        * Directory where to save database in
        * @default "."
        */
      var dir: js.UndefOr[String] = js.undefined
      
      /**
        * Table of where sessions are stored
        * @default "sessions"
        */
      var table: js.UndefOr[String] = js.undefined
    }
    object SQLiteStoreOptions {
      
      inline def apply(): SQLiteStoreOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SQLiteStoreOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SQLiteStoreOptions] (val x: Self) extends AnyVal {
        
        inline def setConcurrentDB(value: String): Self = StObject.set(x, "concurrentDB", value.asInstanceOf[js.Any])
        
        inline def setConcurrentDBUndefined: Self = StObject.set(x, "concurrentDB", js.undefined)
        
        inline def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
        
        inline def setDbUndefined: Self = StObject.set(x, "db", js.undefined)
        
        inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
        
        inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
        
        inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
        
        inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
      }
    }
    
    trait SessionData extends StObject {
      
      var cookie: Cookie
    }
    object SessionData {
      
      inline def apply(cookie: Cookie): SessionData = {
        val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any])
        __obj.asInstanceOf[SessionData]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SessionData] (val x: Self) extends AnyVal {
        
        inline def setCookie(value: Cookie): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Store extends EventEmitter {
      
      /** Returns all sessions in the store */
      // https://github.com/DefinitelyTyped/DefinitelyTyped/pull/38783, https://github.com/expressjs/session/pull/700#issuecomment-540855551
      var all: js.UndefOr[
            js.Function1[
              /* callback */ js.Function2[
                /* err */ Any, 
                /* obj */ js.UndefOr[js.Array[SessionData] | StringDictionary[SessionData] | Null], 
                Unit
              ], 
              Unit
            ]
          ] = js.native
      
      /** Delete all sessions from the store. */
      var clear: js.UndefOr[
            js.Function1[/* callback */ js.UndefOr[js.Function1[/* err */ js.UndefOr[Any], Unit]], Unit]
          ] = js.native
      
      def createSession(
        req: Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ],
        session: SessionData
      ): Unit = js.native
      
      /** Destroys the dession with the given session ID. */
      def destroy(sid: String): Unit = js.native
      def destroy(sid: String, callback: js.Function1[/* err */ js.UndefOr[Any], Unit]): Unit = js.native
      
      /**
        * Gets the session from the store given a session ID and passes it to `callback`.
        *
        * The `session` argument should be a `Session` object if found, otherwise `null` or `undefined` if the session was not found and there was no error.
        * A special case is made when `error.code === 'ENOENT'` to act like `callback(null, null)`.
        */
      def get(
        sid: String,
        callback: js.Function2[/* err */ Any, /* session */ js.UndefOr[SessionData | Null], Unit]
      ): Unit = js.native
      
      /** Returns the amount of sessions in the store. */
      var length: js.UndefOr[
            js.Function1[/* callback */ js.Function2[/* err */ Any, /* length */ Double, Unit], Unit]
          ] = js.native
      
      def load(sid: String, callback: js.Function2[/* err */ Any, /* session */ js.UndefOr[SessionData], Any]): Unit = js.native
      
      def regenerate(
        req: Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ],
        callback: js.Function1[/* err */ js.UndefOr[Any], Any]
      ): Unit = js.native
      
      /** Upsert a session in the store given a session ID and `SessionData` */
      def set(sid: String, session: SessionData): Unit = js.native
      def set(sid: String, session: SessionData, callback: js.Function1[/* err */ js.UndefOr[Any], Unit]): Unit = js.native
      
      /** "Touches" a given session, resetting the idle timer. */
      var touch: js.UndefOr[
            js.Function3[
              /* sid */ String, 
              /* session */ SessionData, 
              /* callback */ js.UndefOr[js.Function0[Unit]], 
              Unit
            ]
          ] = js.native
    }
  }
}
