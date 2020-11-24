package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.cognitoIdentityClientMod.CognitoIdentityClient
import typings.awsSdkClientCognitoIdentityBrowser.typesCreateIdentityPoolInputMod.CreateIdentityPoolInput
import typings.awsSdkClientCognitoIdentityBrowser.typesCreateIdentityPoolOutputMod.CreateIdentityPoolOutput
import typings.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentitiesInputMod.DeleteIdentitiesInput
import typings.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentitiesOutputMod.DeleteIdentitiesOutput
import typings.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentityPoolInputMod.DeleteIdentityPoolInput
import typings.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentityPoolOutputMod.DeleteIdentityPoolOutput
import typings.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityInputMod.DescribeIdentityInput
import typings.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityOutputMod.DescribeIdentityOutput
import typings.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityPoolInputMod.DescribeIdentityPoolInput
import typings.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityPoolOutputMod.DescribeIdentityPoolOutput
import typings.awsSdkClientCognitoIdentityBrowser.typesGetCredentialsForIdentityInputMod.GetCredentialsForIdentityInput
import typings.awsSdkClientCognitoIdentityBrowser.typesGetCredentialsForIdentityOutputMod.GetCredentialsForIdentityOutput
import typings.awsSdkClientCognitoIdentityBrowser.typesGetIdInputMod.GetIdInput
import typings.awsSdkClientCognitoIdentityBrowser.typesGetIdOutputMod.GetIdOutput
import typings.awsSdkClientCognitoIdentityBrowser.typesGetIdentityPoolRolesInputMod.GetIdentityPoolRolesInput
import typings.awsSdkClientCognitoIdentityBrowser.typesGetIdentityPoolRolesOutputMod.GetIdentityPoolRolesOutput
import typings.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenForDeveloperIdentityInputMod.GetOpenIdTokenForDeveloperIdentityInput
import typings.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenForDeveloperIdentityOutputMod.GetOpenIdTokenForDeveloperIdentityOutput
import typings.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenInputMod.GetOpenIdTokenInput
import typings.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenOutputMod.GetOpenIdTokenOutput
import typings.awsSdkClientCognitoIdentityBrowser.typesListIdentitiesInputMod.ListIdentitiesInput
import typings.awsSdkClientCognitoIdentityBrowser.typesListIdentitiesOutputMod.ListIdentitiesOutput
import typings.awsSdkClientCognitoIdentityBrowser.typesListIdentityPoolsInputMod.ListIdentityPoolsInput
import typings.awsSdkClientCognitoIdentityBrowser.typesListIdentityPoolsOutputMod.ListIdentityPoolsOutput
import typings.awsSdkClientCognitoIdentityBrowser.typesLookupDeveloperIdentityInputMod.LookupDeveloperIdentityInput
import typings.awsSdkClientCognitoIdentityBrowser.typesLookupDeveloperIdentityOutputMod.LookupDeveloperIdentityOutput
import typings.awsSdkClientCognitoIdentityBrowser.typesMergeDeveloperIdentitiesInputMod.MergeDeveloperIdentitiesInput
import typings.awsSdkClientCognitoIdentityBrowser.typesMergeDeveloperIdentitiesOutputMod.MergeDeveloperIdentitiesOutput
import typings.awsSdkClientCognitoIdentityBrowser.typesSetIdentityPoolRolesInputMod.SetIdentityPoolRolesInput
import typings.awsSdkClientCognitoIdentityBrowser.typesSetIdentityPoolRolesOutputMod.SetIdentityPoolRolesOutput
import typings.awsSdkClientCognitoIdentityBrowser.typesUnlinkDeveloperIdentityInputMod.UnlinkDeveloperIdentityInput
import typings.awsSdkClientCognitoIdentityBrowser.typesUnlinkDeveloperIdentityOutputMod.UnlinkDeveloperIdentityOutput
import typings.awsSdkClientCognitoIdentityBrowser.typesUnlinkIdentityInputMod.UnlinkIdentityInput
import typings.awsSdkClientCognitoIdentityBrowser.typesUnlinkIdentityOutputMod.UnlinkIdentityOutput
import typings.awsSdkClientCognitoIdentityBrowser.typesUpdateIdentityPoolInputMod.UpdateIdentityPoolInput
import typings.awsSdkClientCognitoIdentityBrowser.typesUpdateIdentityPoolOutputMod.UpdateIdentityPoolOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity-browser/CognitoIdentity", JSImport.Namespace)
@js.native
object cognitoIdentityMod extends js.Object {
  
  @js.native
  class CognitoIdentity () extends CognitoIdentityClient {
    
    /**
      * <p>Creates a new identity pool. The identity pool is a store of user identity information that is specific to your AWS account. The limit on identity pools is 60 per account. The keys for <code>SupportedLoginProviders</code> are as follows:</p> <ul> <li> <p>Facebook: <code>graph.facebook.com</code> </p> </li> <li> <p>Google: <code>accounts.google.com</code> </p> </li> <li> <p>Amazon: <code>www.amazon.com</code> </p> </li> <li> <p>Twitter: <code>api.twitter.com</code> </p> </li> <li> <p>Digits: <code>www.digits.com</code> </p> </li> </ul> <p>You must use AWS Developer credentials to call this API.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {InvalidParameterException} <p>Thrown for missing or bad input parameter(s).</p>
      *   - {NotAuthorizedException} <p>Thrown when a user is not authorized to access the requested resource.</p>
      *   - {ResourceConflictException} <p>Thrown when a user tries to use a login which is already linked to another account.</p>
      *   - {TooManyRequestsException} <p>Thrown when a request is throttled.</p>
      *   - {InternalErrorException} <p>Thrown when the service encounters an error during processing the request.</p>
      *   - {LimitExceededException} <p>Thrown when the total number of user pools has exceeded a preset limit.</p>
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def createIdentityPool(args: CreateIdentityPoolInput): js.Promise[CreateIdentityPoolOutput] = js.native
    def createIdentityPool(
      args: CreateIdentityPoolInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[CreateIdentityPoolOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Deletes identities from an identity pool. You can specify a list of 1-60 identities that you want to delete.</p> <p>You must use AWS Developer credentials to call this API.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {InvalidParameterException} <p>Thrown for missing or bad input parameter(s).</p>
      *   - {TooManyRequestsException} <p>Thrown when a request is throttled.</p>
      *   - {InternalErrorException} <p>Thrown when the service encounters an error during processing the request.</p>
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def deleteIdentities(args: DeleteIdentitiesInput): js.Promise[DeleteIdentitiesOutput] = js.native
    def deleteIdentities(
      args: DeleteIdentitiesInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[DeleteIdentitiesOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Deletes a user pool. Once a pool is deleted, users will not be able to authenticate with the pool.</p> <p>You must use AWS Developer credentials to call this API.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {InvalidParameterException} <p>Thrown for missing or bad input parameter(s).</p>
      *   - {ResourceNotFoundException} <p>Thrown when the requested resource (for example, a dataset or record) does not exist.</p>
      *   - {NotAuthorizedException} <p>Thrown when a user is not authorized to access the requested resource.</p>
      *   - {TooManyRequestsException} <p>Thrown when a request is throttled.</p>
      *   - {InternalErrorException} <p>Thrown when the service encounters an error during processing the request.</p>
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def deleteIdentityPool(args: DeleteIdentityPoolInput): js.Promise[DeleteIdentityPoolOutput] = js.native
    def deleteIdentityPool(
      args: DeleteIdentityPoolInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[DeleteIdentityPoolOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Returns metadata related to the given identity, including when the identity was created and any associated linked logins.</p> <p>You must use AWS Developer credentials to call this API.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {InvalidParameterException} <p>Thrown for missing or bad input parameter(s).</p>
      *   - {ResourceNotFoundException} <p>Thrown when the requested resource (for example, a dataset or record) does not exist.</p>
      *   - {NotAuthorizedException} <p>Thrown when a user is not authorized to access the requested resource.</p>
      *   - {TooManyRequestsException} <p>Thrown when a request is throttled.</p>
      *   - {InternalErrorException} <p>Thrown when the service encounters an error during processing the request.</p>
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def describeIdentity(args: DescribeIdentityInput): js.Promise[DescribeIdentityOutput] = js.native
    def describeIdentity(
      args: DescribeIdentityInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[DescribeIdentityOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Gets details about a particular identity pool, including the pool name, ID description, creation date, and current number of users.</p> <p>You must use AWS Developer credentials to call this API.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {InvalidParameterException} <p>Thrown for missing or bad input parameter(s).</p>
      *   - {ResourceNotFoundException} <p>Thrown when the requested resource (for example, a dataset or record) does not exist.</p>
      *   - {NotAuthorizedException} <p>Thrown when a user is not authorized to access the requested resource.</p>
      *   - {TooManyRequestsException} <p>Thrown when a request is throttled.</p>
      *   - {InternalErrorException} <p>Thrown when the service encounters an error during processing the request.</p>
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def describeIdentityPool(args: DescribeIdentityPoolInput): js.Promise[DescribeIdentityPoolOutput] = js.native
    def describeIdentityPool(
      args: DescribeIdentityPoolInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[DescribeIdentityPoolOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Returns credentials for the provided identity ID. Any provided logins will be validated against supported login providers. If the token is for cognito-identity.amazonaws.com, it will be passed through to AWS Security Token Service with the appropriate role for the token.</p> <p>This is a public API. You do not need any credentials to call this API.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {InvalidParameterException} <p>Thrown for missing or bad input parameter(s).</p>
      *   - {ResourceNotFoundException} <p>Thrown when the requested resource (for example, a dataset or record) does not exist.</p>
      *   - {NotAuthorizedException} <p>Thrown when a user is not authorized to access the requested resource.</p>
      *   - {ResourceConflictException} <p>Thrown when a user tries to use a login which is already linked to another account.</p>
      *   - {TooManyRequestsException} <p>Thrown when a request is throttled.</p>
      *   - {InvalidIdentityPoolConfigurationException} <p>Thrown if the identity pool has no role associated for the given auth type (auth/unauth) or if the AssumeRole fails.</p>
      *   - {InternalErrorException} <p>Thrown when the service encounters an error during processing the request.</p>
      *   - {ExternalServiceException} <p>An exception thrown when a dependent service such as Facebook or Twitter is not responding</p>
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def getCredentialsForIdentity(args: GetCredentialsForIdentityInput): js.Promise[GetCredentialsForIdentityOutput] = js.native
    def getCredentialsForIdentity(
      args: GetCredentialsForIdentityInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[GetCredentialsForIdentityOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Generates (or retrieves) a Cognito ID. Supplying multiple logins will create an implicit linked account.</p> <p>This is a public API. You do not need any credentials to call this API.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {InvalidParameterException} <p>Thrown for missing or bad input parameter(s).</p>
      *   - {ResourceNotFoundException} <p>Thrown when the requested resource (for example, a dataset or record) does not exist.</p>
      *   - {NotAuthorizedException} <p>Thrown when a user is not authorized to access the requested resource.</p>
      *   - {ResourceConflictException} <p>Thrown when a user tries to use a login which is already linked to another account.</p>
      *   - {TooManyRequestsException} <p>Thrown when a request is throttled.</p>
      *   - {InternalErrorException} <p>Thrown when the service encounters an error during processing the request.</p>
      *   - {LimitExceededException} <p>Thrown when the total number of user pools has exceeded a preset limit.</p>
      *   - {ExternalServiceException} <p>An exception thrown when a dependent service such as Facebook or Twitter is not responding</p>
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def getId(args: GetIdInput): js.Promise[GetIdOutput] = js.native
    def getId(args: GetIdInput, cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[GetIdOutput], Unit]): Unit = js.native
    
    /**
      * <p>Gets the roles for an identity pool.</p> <p>You must use AWS Developer credentials to call this API.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {InvalidParameterException} <p>Thrown for missing or bad input parameter(s).</p>
      *   - {ResourceNotFoundException} <p>Thrown when the requested resource (for example, a dataset or record) does not exist.</p>
      *   - {NotAuthorizedException} <p>Thrown when a user is not authorized to access the requested resource.</p>
      *   - {ResourceConflictException} <p>Thrown when a user tries to use a login which is already linked to another account.</p>
      *   - {TooManyRequestsException} <p>Thrown when a request is throttled.</p>
      *   - {InternalErrorException} <p>Thrown when the service encounters an error during processing the request.</p>
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def getIdentityPoolRoles(args: GetIdentityPoolRolesInput): js.Promise[GetIdentityPoolRolesOutput] = js.native
    def getIdentityPoolRoles(
      args: GetIdentityPoolRolesInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[GetIdentityPoolRolesOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Gets an OpenID token, using a known Cognito ID. This known Cognito ID is returned by <a>GetId</a>. You can optionally add additional logins for the identity. Supplying multiple logins creates an implicit link.</p> <p>The OpenId token is valid for 15 minutes.</p> <p>This is a public API. You do not need any credentials to call this API.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {InvalidParameterException} <p>Thrown for missing or bad input parameter(s).</p>
      *   - {ResourceNotFoundException} <p>Thrown when the requested resource (for example, a dataset or record) does not exist.</p>
      *   - {NotAuthorizedException} <p>Thrown when a user is not authorized to access the requested resource.</p>
      *   - {ResourceConflictException} <p>Thrown when a user tries to use a login which is already linked to another account.</p>
      *   - {TooManyRequestsException} <p>Thrown when a request is throttled.</p>
      *   - {InternalErrorException} <p>Thrown when the service encounters an error during processing the request.</p>
      *   - {ExternalServiceException} <p>An exception thrown when a dependent service such as Facebook or Twitter is not responding</p>
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def getOpenIdToken(args: GetOpenIdTokenInput): js.Promise[GetOpenIdTokenOutput] = js.native
    def getOpenIdToken(
      args: GetOpenIdTokenInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[GetOpenIdTokenOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Registers (or retrieves) a Cognito <code>IdentityId</code> and an OpenID Connect token for a user authenticated by your backend authentication process. Supplying multiple logins will create an implicit linked account. You can only specify one developer provider as part of the <code>Logins</code> map, which is linked to the identity pool. The developer provider is the "domain" by which Cognito will refer to your users.</p> <p>You can use <code>GetOpenIdTokenForDeveloperIdentity</code> to create a new identity and to link new logins (that is, user credentials issued by a public provider or developer provider) to an existing identity. When you want to create a new identity, the <code>IdentityId</code> should be null. When you want to associate a new login with an existing authenticated/unauthenticated identity, you can do so by providing the existing <code>IdentityId</code>. This API will create the identity in the specified <code>IdentityPoolId</code>.</p> <p>You must use AWS Developer credentials to call this API.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {InvalidParameterException} <p>Thrown for missing or bad input parameter(s).</p>
      *   - {ResourceNotFoundException} <p>Thrown when the requested resource (for example, a dataset or record) does not exist.</p>
      *   - {NotAuthorizedException} <p>Thrown when a user is not authorized to access the requested resource.</p>
      *   - {ResourceConflictException} <p>Thrown when a user tries to use a login which is already linked to another account.</p>
      *   - {TooManyRequestsException} <p>Thrown when a request is throttled.</p>
      *   - {InternalErrorException} <p>Thrown when the service encounters an error during processing the request.</p>
      *   - {DeveloperUserAlreadyRegisteredException} <p>The provided developer user identifier is already registered with Cognito under a different identity ID.</p>
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def getOpenIdTokenForDeveloperIdentity(args: GetOpenIdTokenForDeveloperIdentityInput): js.Promise[GetOpenIdTokenForDeveloperIdentityOutput] = js.native
    def getOpenIdTokenForDeveloperIdentity(
      args: GetOpenIdTokenForDeveloperIdentityInput,
      cb: js.Function2[
          /* err */ js.Any, 
          /* data */ js.UndefOr[GetOpenIdTokenForDeveloperIdentityOutput], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * <p>Lists the identities in a pool.</p> <p>You must use AWS Developer credentials to call this API.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {InvalidParameterException} <p>Thrown for missing or bad input parameter(s).</p>
      *   - {ResourceNotFoundException} <p>Thrown when the requested resource (for example, a dataset or record) does not exist.</p>
      *   - {NotAuthorizedException} <p>Thrown when a user is not authorized to access the requested resource.</p>
      *   - {TooManyRequestsException} <p>Thrown when a request is throttled.</p>
      *   - {InternalErrorException} <p>Thrown when the service encounters an error during processing the request.</p>
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def listIdentities(args: ListIdentitiesInput): js.Promise[ListIdentitiesOutput] = js.native
    def listIdentities(
      args: ListIdentitiesInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[ListIdentitiesOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Lists all of the Cognito identity pools registered for your account.</p> <p>You must use AWS Developer credentials to call this API.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {InvalidParameterException} <p>Thrown for missing or bad input parameter(s).</p>
      *   - {NotAuthorizedException} <p>Thrown when a user is not authorized to access the requested resource.</p>
      *   - {TooManyRequestsException} <p>Thrown when a request is throttled.</p>
      *   - {InternalErrorException} <p>Thrown when the service encounters an error during processing the request.</p>
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def listIdentityPools(args: ListIdentityPoolsInput): js.Promise[ListIdentityPoolsOutput] = js.native
    def listIdentityPools(
      args: ListIdentityPoolsInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[ListIdentityPoolsOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Retrieves the <code>IdentityID</code> associated with a <code>DeveloperUserIdentifier</code> or the list of <code>DeveloperUserIdentifier</code>s associated with an <code>IdentityId</code> for an existing identity. Either <code>IdentityID</code> or <code>DeveloperUserIdentifier</code> must not be null. If you supply only one of these values, the other value will be searched in the database and returned as a part of the response. If you supply both, <code>DeveloperUserIdentifier</code> will be matched against <code>IdentityID</code>. If the values are verified against the database, the response returns both values and is the same as the request. Otherwise a <code>ResourceConflictException</code> is thrown.</p> <p>You must use AWS Developer credentials to call this API.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {InvalidParameterException} <p>Thrown for missing or bad input parameter(s).</p>
      *   - {ResourceNotFoundException} <p>Thrown when the requested resource (for example, a dataset or record) does not exist.</p>
      *   - {NotAuthorizedException} <p>Thrown when a user is not authorized to access the requested resource.</p>
      *   - {ResourceConflictException} <p>Thrown when a user tries to use a login which is already linked to another account.</p>
      *   - {TooManyRequestsException} <p>Thrown when a request is throttled.</p>
      *   - {InternalErrorException} <p>Thrown when the service encounters an error during processing the request.</p>
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def lookupDeveloperIdentity(args: LookupDeveloperIdentityInput): js.Promise[LookupDeveloperIdentityOutput] = js.native
    def lookupDeveloperIdentity(
      args: LookupDeveloperIdentityInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[LookupDeveloperIdentityOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Merges two users having different <code>IdentityId</code>s, existing in the same identity pool, and identified by the same developer provider. You can use this action to request that discrete users be merged and identified as a single user in the Cognito environment. Cognito associates the given source user (<code>SourceUserIdentifier</code>) with the <code>IdentityId</code> of the <code>DestinationUserIdentifier</code>. Only developer-authenticated users can be merged. If the users to be merged are associated with the same public provider, but as two different users, an exception will be thrown.</p> <p>You must use AWS Developer credentials to call this API.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {InvalidParameterException} <p>Thrown for missing or bad input parameter(s).</p>
      *   - {ResourceNotFoundException} <p>Thrown when the requested resource (for example, a dataset or record) does not exist.</p>
      *   - {NotAuthorizedException} <p>Thrown when a user is not authorized to access the requested resource.</p>
      *   - {ResourceConflictException} <p>Thrown when a user tries to use a login which is already linked to another account.</p>
      *   - {TooManyRequestsException} <p>Thrown when a request is throttled.</p>
      *   - {InternalErrorException} <p>Thrown when the service encounters an error during processing the request.</p>
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def mergeDeveloperIdentities(args: MergeDeveloperIdentitiesInput): js.Promise[MergeDeveloperIdentitiesOutput] = js.native
    def mergeDeveloperIdentities(
      args: MergeDeveloperIdentitiesInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[MergeDeveloperIdentitiesOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Sets the roles for an identity pool. These roles are used when making calls to <a>GetCredentialsForIdentity</a> action.</p> <p>You must use AWS Developer credentials to call this API.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {InvalidParameterException} <p>Thrown for missing or bad input parameter(s).</p>
      *   - {ResourceNotFoundException} <p>Thrown when the requested resource (for example, a dataset or record) does not exist.</p>
      *   - {NotAuthorizedException} <p>Thrown when a user is not authorized to access the requested resource.</p>
      *   - {ResourceConflictException} <p>Thrown when a user tries to use a login which is already linked to another account.</p>
      *   - {TooManyRequestsException} <p>Thrown when a request is throttled.</p>
      *   - {InternalErrorException} <p>Thrown when the service encounters an error during processing the request.</p>
      *   - {ConcurrentModificationException} <p>Thrown if there are parallel requests to modify a resource.</p>
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def setIdentityPoolRoles(args: SetIdentityPoolRolesInput): js.Promise[SetIdentityPoolRolesOutput] = js.native
    def setIdentityPoolRoles(
      args: SetIdentityPoolRolesInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[SetIdentityPoolRolesOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Unlinks a <code>DeveloperUserIdentifier</code> from an existing identity. Unlinked developer users will be considered new identities next time they are seen. If, for a given Cognito identity, you remove all federated identities as well as the developer user identifier, the Cognito identity becomes inaccessible.</p> <p>You must use AWS Developer credentials to call this API.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {InvalidParameterException} <p>Thrown for missing or bad input parameter(s).</p>
      *   - {ResourceNotFoundException} <p>Thrown when the requested resource (for example, a dataset or record) does not exist.</p>
      *   - {NotAuthorizedException} <p>Thrown when a user is not authorized to access the requested resource.</p>
      *   - {ResourceConflictException} <p>Thrown when a user tries to use a login which is already linked to another account.</p>
      *   - {TooManyRequestsException} <p>Thrown when a request is throttled.</p>
      *   - {InternalErrorException} <p>Thrown when the service encounters an error during processing the request.</p>
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def unlinkDeveloperIdentity(args: UnlinkDeveloperIdentityInput): js.Promise[UnlinkDeveloperIdentityOutput] = js.native
    def unlinkDeveloperIdentity(
      args: UnlinkDeveloperIdentityInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[UnlinkDeveloperIdentityOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Unlinks a federated identity from an existing account. Unlinked logins will be considered new identities next time they are seen. Removing the last linked login will make this identity inaccessible.</p> <p>This is a public API. You do not need any credentials to call this API.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {InvalidParameterException} <p>Thrown for missing or bad input parameter(s).</p>
      *   - {ResourceNotFoundException} <p>Thrown when the requested resource (for example, a dataset or record) does not exist.</p>
      *   - {NotAuthorizedException} <p>Thrown when a user is not authorized to access the requested resource.</p>
      *   - {ResourceConflictException} <p>Thrown when a user tries to use a login which is already linked to another account.</p>
      *   - {TooManyRequestsException} <p>Thrown when a request is throttled.</p>
      *   - {InternalErrorException} <p>Thrown when the service encounters an error during processing the request.</p>
      *   - {ExternalServiceException} <p>An exception thrown when a dependent service such as Facebook or Twitter is not responding</p>
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def unlinkIdentity(args: UnlinkIdentityInput): js.Promise[UnlinkIdentityOutput] = js.native
    def unlinkIdentity(
      args: UnlinkIdentityInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[UnlinkIdentityOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Updates a user pool.</p> <p>You must use AWS Developer credentials to call this API.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {InvalidParameterException} <p>Thrown for missing or bad input parameter(s).</p>
      *   - {ResourceNotFoundException} <p>Thrown when the requested resource (for example, a dataset or record) does not exist.</p>
      *   - {NotAuthorizedException} <p>Thrown when a user is not authorized to access the requested resource.</p>
      *   - {ResourceConflictException} <p>Thrown when a user tries to use a login which is already linked to another account.</p>
      *   - {TooManyRequestsException} <p>Thrown when a request is throttled.</p>
      *   - {InternalErrorException} <p>Thrown when the service encounters an error during processing the request.</p>
      *   - {ConcurrentModificationException} <p>Thrown if there are parallel requests to modify a resource.</p>
      *   - {LimitExceededException} <p>Thrown when the total number of user pools has exceeded a preset limit.</p>
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def updateIdentityPool(args: UpdateIdentityPoolInput): js.Promise[UpdateIdentityPoolOutput] = js.native
    def updateIdentityPool(
      args: UpdateIdentityPoolInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[UpdateIdentityPoolOutput], Unit]
    ): Unit = js.native
  }
}
