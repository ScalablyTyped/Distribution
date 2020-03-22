package typings.awsSdk.cognitoidentityserviceproviderMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CognitoIdentityServiceProvider extends Service {
  @JSName("config")
  var config_CognitoIdentityServiceProvider: ConfigBase with ClientConfiguration = js.native
  /**
    * Adds additional user attributes to the user pool schema.
    */
  def addCustomAttributes(): Request[AddCustomAttributesResponse, AWSError] = js.native
  def addCustomAttributes(callback: js.Function2[/* err */ AWSError, /* data */ AddCustomAttributesResponse, Unit]): Request[AddCustomAttributesResponse, AWSError] = js.native
  /**
    * Adds additional user attributes to the user pool schema.
    */
  def addCustomAttributes(params: AddCustomAttributesRequest): Request[AddCustomAttributesResponse, AWSError] = js.native
  def addCustomAttributes(
    params: AddCustomAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddCustomAttributesResponse, Unit]
  ): Request[AddCustomAttributesResponse, AWSError] = js.native
  /**
    * Adds the specified user to the specified group. Calling this action requires developer credentials.
    */
  def adminAddUserToGroup(): Request[js.Object, AWSError] = js.native
  def adminAddUserToGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds the specified user to the specified group. Calling this action requires developer credentials.
    */
  def adminAddUserToGroup(params: AdminAddUserToGroupRequest): Request[js.Object, AWSError] = js.native
  def adminAddUserToGroup(
    params: AdminAddUserToGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Confirms user registration as an admin without using a confirmation code. Works on any user. Calling this action requires developer credentials.
    */
  def adminConfirmSignUp(): Request[AdminConfirmSignUpResponse, AWSError] = js.native
  def adminConfirmSignUp(callback: js.Function2[/* err */ AWSError, /* data */ AdminConfirmSignUpResponse, Unit]): Request[AdminConfirmSignUpResponse, AWSError] = js.native
  /**
    * Confirms user registration as an admin without using a confirmation code. Works on any user. Calling this action requires developer credentials.
    */
  def adminConfirmSignUp(params: AdminConfirmSignUpRequest): Request[AdminConfirmSignUpResponse, AWSError] = js.native
  def adminConfirmSignUp(
    params: AdminConfirmSignUpRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AdminConfirmSignUpResponse, Unit]
  ): Request[AdminConfirmSignUpResponse, AWSError] = js.native
  /**
    * Creates a new user in the specified user pool. If MessageAction is not set, the default is to send a welcome message via email or phone (SMS).  This message is based on a template that you configured in your call to or . This template includes your custom sign-up instructions and placeholders for user name and temporary password.  Alternatively, you can call AdminCreateUser with “SUPPRESS” for the MessageAction parameter, and Amazon Cognito will not send any email.  In either case, the user will be in the FORCE_CHANGE_PASSWORD state until they sign in and change their password. AdminCreateUser requires developer credentials.
    */
  def adminCreateUser(): Request[AdminCreateUserResponse, AWSError] = js.native
  def adminCreateUser(callback: js.Function2[/* err */ AWSError, /* data */ AdminCreateUserResponse, Unit]): Request[AdminCreateUserResponse, AWSError] = js.native
  /**
    * Creates a new user in the specified user pool. If MessageAction is not set, the default is to send a welcome message via email or phone (SMS).  This message is based on a template that you configured in your call to or . This template includes your custom sign-up instructions and placeholders for user name and temporary password.  Alternatively, you can call AdminCreateUser with “SUPPRESS” for the MessageAction parameter, and Amazon Cognito will not send any email.  In either case, the user will be in the FORCE_CHANGE_PASSWORD state until they sign in and change their password. AdminCreateUser requires developer credentials.
    */
  def adminCreateUser(params: AdminCreateUserRequest): Request[AdminCreateUserResponse, AWSError] = js.native
  def adminCreateUser(
    params: AdminCreateUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AdminCreateUserResponse, Unit]
  ): Request[AdminCreateUserResponse, AWSError] = js.native
  /**
    * Deletes a user as an administrator. Works on any user. Calling this action requires developer credentials.
    */
  def adminDeleteUser(): Request[js.Object, AWSError] = js.native
  def adminDeleteUser(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a user as an administrator. Works on any user. Calling this action requires developer credentials.
    */
  def adminDeleteUser(params: AdminDeleteUserRequest): Request[js.Object, AWSError] = js.native
  def adminDeleteUser(
    params: AdminDeleteUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the user attributes in a user pool as an administrator. Works on any user. Calling this action requires developer credentials.
    */
  def adminDeleteUserAttributes(): Request[AdminDeleteUserAttributesResponse, AWSError] = js.native
  def adminDeleteUserAttributes(callback: js.Function2[/* err */ AWSError, /* data */ AdminDeleteUserAttributesResponse, Unit]): Request[AdminDeleteUserAttributesResponse, AWSError] = js.native
  /**
    * Deletes the user attributes in a user pool as an administrator. Works on any user. Calling this action requires developer credentials.
    */
  def adminDeleteUserAttributes(params: AdminDeleteUserAttributesRequest): Request[AdminDeleteUserAttributesResponse, AWSError] = js.native
  def adminDeleteUserAttributes(
    params: AdminDeleteUserAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AdminDeleteUserAttributesResponse, Unit]
  ): Request[AdminDeleteUserAttributesResponse, AWSError] = js.native
  /**
    * Disables the user from signing in with the specified external (SAML or social) identity provider. If the user to disable is a Cognito User Pools native username + password user, they are not permitted to use their password to sign-in. If the user to disable is a linked external IdP user, any link between that user and an existing user is removed. The next time the external user (no longer attached to the previously linked DestinationUser) signs in, they must create a new user account. See . This action is enabled only for admin access and requires developer credentials. The ProviderName must match the value specified when creating an IdP for the pool.  To disable a native username + password user, the ProviderName value must be Cognito and the ProviderAttributeName must be Cognito_Subject, with the ProviderAttributeValue being the name that is used in the user pool for the user. The ProviderAttributeName must always be Cognito_Subject for social identity providers. The ProviderAttributeValue must always be the exact subject that was used when the user was originally linked as a source user. For de-linking a SAML identity, there are two scenarios. If the linked identity has not yet been used to sign-in, the ProviderAttributeName and ProviderAttributeValue must be the same values that were used for the SourceUser when the identities were originally linked in the call. (If the linking was done with ProviderAttributeName set to Cognito_Subject, the same applies here). However, if the user has already signed in, the ProviderAttributeName must be Cognito_Subject and ProviderAttributeValue must be the subject of the SAML assertion.
    */
  def adminDisableProviderForUser(): Request[AdminDisableProviderForUserResponse, AWSError] = js.native
  def adminDisableProviderForUser(callback: js.Function2[/* err */ AWSError, /* data */ AdminDisableProviderForUserResponse, Unit]): Request[AdminDisableProviderForUserResponse, AWSError] = js.native
  /**
    * Disables the user from signing in with the specified external (SAML or social) identity provider. If the user to disable is a Cognito User Pools native username + password user, they are not permitted to use their password to sign-in. If the user to disable is a linked external IdP user, any link between that user and an existing user is removed. The next time the external user (no longer attached to the previously linked DestinationUser) signs in, they must create a new user account. See . This action is enabled only for admin access and requires developer credentials. The ProviderName must match the value specified when creating an IdP for the pool.  To disable a native username + password user, the ProviderName value must be Cognito and the ProviderAttributeName must be Cognito_Subject, with the ProviderAttributeValue being the name that is used in the user pool for the user. The ProviderAttributeName must always be Cognito_Subject for social identity providers. The ProviderAttributeValue must always be the exact subject that was used when the user was originally linked as a source user. For de-linking a SAML identity, there are two scenarios. If the linked identity has not yet been used to sign-in, the ProviderAttributeName and ProviderAttributeValue must be the same values that were used for the SourceUser when the identities were originally linked in the call. (If the linking was done with ProviderAttributeName set to Cognito_Subject, the same applies here). However, if the user has already signed in, the ProviderAttributeName must be Cognito_Subject and ProviderAttributeValue must be the subject of the SAML assertion.
    */
  def adminDisableProviderForUser(params: AdminDisableProviderForUserRequest): Request[AdminDisableProviderForUserResponse, AWSError] = js.native
  def adminDisableProviderForUser(
    params: AdminDisableProviderForUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AdminDisableProviderForUserResponse, Unit]
  ): Request[AdminDisableProviderForUserResponse, AWSError] = js.native
  /**
    * Disables the specified user. Calling this action requires developer credentials.
    */
  def adminDisableUser(): Request[AdminDisableUserResponse, AWSError] = js.native
  def adminDisableUser(callback: js.Function2[/* err */ AWSError, /* data */ AdminDisableUserResponse, Unit]): Request[AdminDisableUserResponse, AWSError] = js.native
  /**
    * Disables the specified user. Calling this action requires developer credentials.
    */
  def adminDisableUser(params: AdminDisableUserRequest): Request[AdminDisableUserResponse, AWSError] = js.native
  def adminDisableUser(
    params: AdminDisableUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AdminDisableUserResponse, Unit]
  ): Request[AdminDisableUserResponse, AWSError] = js.native
  /**
    * Enables the specified user as an administrator. Works on any user. Calling this action requires developer credentials.
    */
  def adminEnableUser(): Request[AdminEnableUserResponse, AWSError] = js.native
  def adminEnableUser(callback: js.Function2[/* err */ AWSError, /* data */ AdminEnableUserResponse, Unit]): Request[AdminEnableUserResponse, AWSError] = js.native
  /**
    * Enables the specified user as an administrator. Works on any user. Calling this action requires developer credentials.
    */
  def adminEnableUser(params: AdminEnableUserRequest): Request[AdminEnableUserResponse, AWSError] = js.native
  def adminEnableUser(
    params: AdminEnableUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AdminEnableUserResponse, Unit]
  ): Request[AdminEnableUserResponse, AWSError] = js.native
  /**
    * Forgets the device, as an administrator. Calling this action requires developer credentials.
    */
  def adminForgetDevice(): Request[js.Object, AWSError] = js.native
  def adminForgetDevice(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Forgets the device, as an administrator. Calling this action requires developer credentials.
    */
  def adminForgetDevice(params: AdminForgetDeviceRequest): Request[js.Object, AWSError] = js.native
  def adminForgetDevice(
    params: AdminForgetDeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Gets the device, as an administrator. Calling this action requires developer credentials.
    */
  def adminGetDevice(): Request[AdminGetDeviceResponse, AWSError] = js.native
  def adminGetDevice(callback: js.Function2[/* err */ AWSError, /* data */ AdminGetDeviceResponse, Unit]): Request[AdminGetDeviceResponse, AWSError] = js.native
  /**
    * Gets the device, as an administrator. Calling this action requires developer credentials.
    */
  def adminGetDevice(params: AdminGetDeviceRequest): Request[AdminGetDeviceResponse, AWSError] = js.native
  def adminGetDevice(
    params: AdminGetDeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AdminGetDeviceResponse, Unit]
  ): Request[AdminGetDeviceResponse, AWSError] = js.native
  /**
    * Gets the specified user by user name in a user pool as an administrator. Works on any user. Calling this action requires developer credentials.
    */
  def adminGetUser(): Request[AdminGetUserResponse, AWSError] = js.native
  def adminGetUser(callback: js.Function2[/* err */ AWSError, /* data */ AdminGetUserResponse, Unit]): Request[AdminGetUserResponse, AWSError] = js.native
  /**
    * Gets the specified user by user name in a user pool as an administrator. Works on any user. Calling this action requires developer credentials.
    */
  def adminGetUser(params: AdminGetUserRequest): Request[AdminGetUserResponse, AWSError] = js.native
  def adminGetUser(
    params: AdminGetUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AdminGetUserResponse, Unit]
  ): Request[AdminGetUserResponse, AWSError] = js.native
  /**
    * Initiates the authentication flow, as an administrator. Calling this action requires developer credentials.
    */
  def adminInitiateAuth(): Request[AdminInitiateAuthResponse, AWSError] = js.native
  def adminInitiateAuth(callback: js.Function2[/* err */ AWSError, /* data */ AdminInitiateAuthResponse, Unit]): Request[AdminInitiateAuthResponse, AWSError] = js.native
  /**
    * Initiates the authentication flow, as an administrator. Calling this action requires developer credentials.
    */
  def adminInitiateAuth(params: AdminInitiateAuthRequest): Request[AdminInitiateAuthResponse, AWSError] = js.native
  def adminInitiateAuth(
    params: AdminInitiateAuthRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AdminInitiateAuthResponse, Unit]
  ): Request[AdminInitiateAuthResponse, AWSError] = js.native
  /**
    * Links an existing user account in a user pool (DestinationUser) to an identity from an external identity provider (SourceUser) based on a specified attribute name and value from the external identity provider. This allows you to create a link from the existing user account to an external federated user identity that has not yet been used to sign in, so that the federated user identity can be used to sign in as the existing user account.   For example, if there is an existing user with a username and password, this API links that user to a federated user identity, so that when the federated user identity is used, the user signs in as the existing user account.   Because this API allows a user with an external federated identity to sign in as an existing user in the user pool, it is critical that it only be used with external identity providers and provider attributes that have been trusted by the application owner.  See also . This action is enabled only for admin access and requires developer credentials.
    */
  def adminLinkProviderForUser(): Request[AdminLinkProviderForUserResponse, AWSError] = js.native
  def adminLinkProviderForUser(callback: js.Function2[/* err */ AWSError, /* data */ AdminLinkProviderForUserResponse, Unit]): Request[AdminLinkProviderForUserResponse, AWSError] = js.native
  /**
    * Links an existing user account in a user pool (DestinationUser) to an identity from an external identity provider (SourceUser) based on a specified attribute name and value from the external identity provider. This allows you to create a link from the existing user account to an external federated user identity that has not yet been used to sign in, so that the federated user identity can be used to sign in as the existing user account.   For example, if there is an existing user with a username and password, this API links that user to a federated user identity, so that when the federated user identity is used, the user signs in as the existing user account.   Because this API allows a user with an external federated identity to sign in as an existing user in the user pool, it is critical that it only be used with external identity providers and provider attributes that have been trusted by the application owner.  See also . This action is enabled only for admin access and requires developer credentials.
    */
  def adminLinkProviderForUser(params: AdminLinkProviderForUserRequest): Request[AdminLinkProviderForUserResponse, AWSError] = js.native
  def adminLinkProviderForUser(
    params: AdminLinkProviderForUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AdminLinkProviderForUserResponse, Unit]
  ): Request[AdminLinkProviderForUserResponse, AWSError] = js.native
  /**
    * Lists devices, as an administrator. Calling this action requires developer credentials.
    */
  def adminListDevices(): Request[AdminListDevicesResponse, AWSError] = js.native
  def adminListDevices(callback: js.Function2[/* err */ AWSError, /* data */ AdminListDevicesResponse, Unit]): Request[AdminListDevicesResponse, AWSError] = js.native
  /**
    * Lists devices, as an administrator. Calling this action requires developer credentials.
    */
  def adminListDevices(params: AdminListDevicesRequest): Request[AdminListDevicesResponse, AWSError] = js.native
  def adminListDevices(
    params: AdminListDevicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AdminListDevicesResponse, Unit]
  ): Request[AdminListDevicesResponse, AWSError] = js.native
  /**
    * Lists the groups that the user belongs to. Calling this action requires developer credentials.
    */
  def adminListGroupsForUser(): Request[AdminListGroupsForUserResponse, AWSError] = js.native
  def adminListGroupsForUser(callback: js.Function2[/* err */ AWSError, /* data */ AdminListGroupsForUserResponse, Unit]): Request[AdminListGroupsForUserResponse, AWSError] = js.native
  /**
    * Lists the groups that the user belongs to. Calling this action requires developer credentials.
    */
  def adminListGroupsForUser(params: AdminListGroupsForUserRequest): Request[AdminListGroupsForUserResponse, AWSError] = js.native
  def adminListGroupsForUser(
    params: AdminListGroupsForUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AdminListGroupsForUserResponse, Unit]
  ): Request[AdminListGroupsForUserResponse, AWSError] = js.native
  /**
    * Lists a history of user activity and any risks detected as part of Amazon Cognito advanced security.
    */
  def adminListUserAuthEvents(): Request[AdminListUserAuthEventsResponse, AWSError] = js.native
  def adminListUserAuthEvents(callback: js.Function2[/* err */ AWSError, /* data */ AdminListUserAuthEventsResponse, Unit]): Request[AdminListUserAuthEventsResponse, AWSError] = js.native
  /**
    * Lists a history of user activity and any risks detected as part of Amazon Cognito advanced security.
    */
  def adminListUserAuthEvents(params: AdminListUserAuthEventsRequest): Request[AdminListUserAuthEventsResponse, AWSError] = js.native
  def adminListUserAuthEvents(
    params: AdminListUserAuthEventsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AdminListUserAuthEventsResponse, Unit]
  ): Request[AdminListUserAuthEventsResponse, AWSError] = js.native
  /**
    * Removes the specified user from the specified group. Calling this action requires developer credentials.
    */
  def adminRemoveUserFromGroup(): Request[js.Object, AWSError] = js.native
  def adminRemoveUserFromGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the specified user from the specified group. Calling this action requires developer credentials.
    */
  def adminRemoveUserFromGroup(params: AdminRemoveUserFromGroupRequest): Request[js.Object, AWSError] = js.native
  def adminRemoveUserFromGroup(
    params: AdminRemoveUserFromGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Resets the specified user's password in a user pool as an administrator. Works on any user. When a developer calls this API, the current password is invalidated, so it must be changed. If a user tries to sign in after the API is called, the app will get a PasswordResetRequiredException exception back and should direct the user down the flow to reset the password, which is the same as the forgot password flow. In addition, if the user pool has phone verification selected and a verified phone number exists for the user, or if email verification is selected and a verified email exists for the user, calling this API will also result in sending a message to the end user with the code to change their password. Calling this action requires developer credentials.
    */
  def adminResetUserPassword(): Request[AdminResetUserPasswordResponse, AWSError] = js.native
  def adminResetUserPassword(callback: js.Function2[/* err */ AWSError, /* data */ AdminResetUserPasswordResponse, Unit]): Request[AdminResetUserPasswordResponse, AWSError] = js.native
  /**
    * Resets the specified user's password in a user pool as an administrator. Works on any user. When a developer calls this API, the current password is invalidated, so it must be changed. If a user tries to sign in after the API is called, the app will get a PasswordResetRequiredException exception back and should direct the user down the flow to reset the password, which is the same as the forgot password flow. In addition, if the user pool has phone verification selected and a verified phone number exists for the user, or if email verification is selected and a verified email exists for the user, calling this API will also result in sending a message to the end user with the code to change their password. Calling this action requires developer credentials.
    */
  def adminResetUserPassword(params: AdminResetUserPasswordRequest): Request[AdminResetUserPasswordResponse, AWSError] = js.native
  def adminResetUserPassword(
    params: AdminResetUserPasswordRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AdminResetUserPasswordResponse, Unit]
  ): Request[AdminResetUserPasswordResponse, AWSError] = js.native
  /**
    * Responds to an authentication challenge, as an administrator. Calling this action requires developer credentials.
    */
  def adminRespondToAuthChallenge(): Request[AdminRespondToAuthChallengeResponse, AWSError] = js.native
  def adminRespondToAuthChallenge(callback: js.Function2[/* err */ AWSError, /* data */ AdminRespondToAuthChallengeResponse, Unit]): Request[AdminRespondToAuthChallengeResponse, AWSError] = js.native
  /**
    * Responds to an authentication challenge, as an administrator. Calling this action requires developer credentials.
    */
  def adminRespondToAuthChallenge(params: AdminRespondToAuthChallengeRequest): Request[AdminRespondToAuthChallengeResponse, AWSError] = js.native
  def adminRespondToAuthChallenge(
    params: AdminRespondToAuthChallengeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AdminRespondToAuthChallengeResponse, Unit]
  ): Request[AdminRespondToAuthChallengeResponse, AWSError] = js.native
  /**
    * Sets the user's multi-factor authentication (MFA) preference, including which MFA options are enabled and if any are preferred. Only one factor can be set as preferred. The preferred MFA factor will be used to authenticate a user if multiple factors are enabled. If multiple options are enabled and no preference is set, a challenge to choose an MFA option will be returned during sign in.
    */
  def adminSetUserMFAPreference(): Request[AdminSetUserMFAPreferenceResponse, AWSError] = js.native
  def adminSetUserMFAPreference(callback: js.Function2[/* err */ AWSError, /* data */ AdminSetUserMFAPreferenceResponse, Unit]): Request[AdminSetUserMFAPreferenceResponse, AWSError] = js.native
  /**
    * Sets the user's multi-factor authentication (MFA) preference, including which MFA options are enabled and if any are preferred. Only one factor can be set as preferred. The preferred MFA factor will be used to authenticate a user if multiple factors are enabled. If multiple options are enabled and no preference is set, a challenge to choose an MFA option will be returned during sign in.
    */
  def adminSetUserMFAPreference(params: AdminSetUserMFAPreferenceRequest): Request[AdminSetUserMFAPreferenceResponse, AWSError] = js.native
  def adminSetUserMFAPreference(
    params: AdminSetUserMFAPreferenceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AdminSetUserMFAPreferenceResponse, Unit]
  ): Request[AdminSetUserMFAPreferenceResponse, AWSError] = js.native
  /**
    * Sets the specified user's password in a user pool as an administrator. Works on any user.  The password can be temporary or permanent. If it is temporary, the user status will be placed into the FORCE_CHANGE_PASSWORD state. When the user next tries to sign in, the InitiateAuth/AdminInitiateAuth response will contain the NEW_PASSWORD_REQUIRED challenge. If the user does not sign in before it expires, the user will not be able to sign in and their password will need to be reset by an administrator.  Once the user has set a new password, or the password is permanent, the user status will be set to Confirmed.
    */
  def adminSetUserPassword(): Request[AdminSetUserPasswordResponse, AWSError] = js.native
  def adminSetUserPassword(callback: js.Function2[/* err */ AWSError, /* data */ AdminSetUserPasswordResponse, Unit]): Request[AdminSetUserPasswordResponse, AWSError] = js.native
  /**
    * Sets the specified user's password in a user pool as an administrator. Works on any user.  The password can be temporary or permanent. If it is temporary, the user status will be placed into the FORCE_CHANGE_PASSWORD state. When the user next tries to sign in, the InitiateAuth/AdminInitiateAuth response will contain the NEW_PASSWORD_REQUIRED challenge. If the user does not sign in before it expires, the user will not be able to sign in and their password will need to be reset by an administrator.  Once the user has set a new password, or the password is permanent, the user status will be set to Confirmed.
    */
  def adminSetUserPassword(params: AdminSetUserPasswordRequest): Request[AdminSetUserPasswordResponse, AWSError] = js.native
  def adminSetUserPassword(
    params: AdminSetUserPasswordRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AdminSetUserPasswordResponse, Unit]
  ): Request[AdminSetUserPasswordResponse, AWSError] = js.native
  /**
    *  This action is no longer supported. You can use it to configure only SMS MFA. You can't use it to configure TOTP software token MFA. To configure either type of MFA, use the AdminSetUserMFAPreference action instead.
    */
  def adminSetUserSettings(): Request[AdminSetUserSettingsResponse, AWSError] = js.native
  def adminSetUserSettings(callback: js.Function2[/* err */ AWSError, /* data */ AdminSetUserSettingsResponse, Unit]): Request[AdminSetUserSettingsResponse, AWSError] = js.native
  /**
    *  This action is no longer supported. You can use it to configure only SMS MFA. You can't use it to configure TOTP software token MFA. To configure either type of MFA, use the AdminSetUserMFAPreference action instead.
    */
  def adminSetUserSettings(params: AdminSetUserSettingsRequest): Request[AdminSetUserSettingsResponse, AWSError] = js.native
  def adminSetUserSettings(
    params: AdminSetUserSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AdminSetUserSettingsResponse, Unit]
  ): Request[AdminSetUserSettingsResponse, AWSError] = js.native
  /**
    * Provides feedback for an authentication event as to whether it was from a valid user. This feedback is used for improving the risk evaluation decision for the user pool as part of Amazon Cognito advanced security.
    */
  def adminUpdateAuthEventFeedback(): Request[AdminUpdateAuthEventFeedbackResponse, AWSError] = js.native
  def adminUpdateAuthEventFeedback(callback: js.Function2[/* err */ AWSError, /* data */ AdminUpdateAuthEventFeedbackResponse, Unit]): Request[AdminUpdateAuthEventFeedbackResponse, AWSError] = js.native
  /**
    * Provides feedback for an authentication event as to whether it was from a valid user. This feedback is used for improving the risk evaluation decision for the user pool as part of Amazon Cognito advanced security.
    */
  def adminUpdateAuthEventFeedback(params: AdminUpdateAuthEventFeedbackRequest): Request[AdminUpdateAuthEventFeedbackResponse, AWSError] = js.native
  def adminUpdateAuthEventFeedback(
    params: AdminUpdateAuthEventFeedbackRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AdminUpdateAuthEventFeedbackResponse, Unit]
  ): Request[AdminUpdateAuthEventFeedbackResponse, AWSError] = js.native
  /**
    * Updates the device status as an administrator. Calling this action requires developer credentials.
    */
  def adminUpdateDeviceStatus(): Request[AdminUpdateDeviceStatusResponse, AWSError] = js.native
  def adminUpdateDeviceStatus(callback: js.Function2[/* err */ AWSError, /* data */ AdminUpdateDeviceStatusResponse, Unit]): Request[AdminUpdateDeviceStatusResponse, AWSError] = js.native
  /**
    * Updates the device status as an administrator. Calling this action requires developer credentials.
    */
  def adminUpdateDeviceStatus(params: AdminUpdateDeviceStatusRequest): Request[AdminUpdateDeviceStatusResponse, AWSError] = js.native
  def adminUpdateDeviceStatus(
    params: AdminUpdateDeviceStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AdminUpdateDeviceStatusResponse, Unit]
  ): Request[AdminUpdateDeviceStatusResponse, AWSError] = js.native
  /**
    * Updates the specified user's attributes, including developer attributes, as an administrator. Works on any user. For custom attributes, you must prepend the custom: prefix to the attribute name. In addition to updating user attributes, this API can also be used to mark phone and email as verified. Calling this action requires developer credentials.
    */
  def adminUpdateUserAttributes(): Request[AdminUpdateUserAttributesResponse, AWSError] = js.native
  def adminUpdateUserAttributes(callback: js.Function2[/* err */ AWSError, /* data */ AdminUpdateUserAttributesResponse, Unit]): Request[AdminUpdateUserAttributesResponse, AWSError] = js.native
  /**
    * Updates the specified user's attributes, including developer attributes, as an administrator. Works on any user. For custom attributes, you must prepend the custom: prefix to the attribute name. In addition to updating user attributes, this API can also be used to mark phone and email as verified. Calling this action requires developer credentials.
    */
  def adminUpdateUserAttributes(params: AdminUpdateUserAttributesRequest): Request[AdminUpdateUserAttributesResponse, AWSError] = js.native
  def adminUpdateUserAttributes(
    params: AdminUpdateUserAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AdminUpdateUserAttributesResponse, Unit]
  ): Request[AdminUpdateUserAttributesResponse, AWSError] = js.native
  /**
    * Signs out users from all devices, as an administrator. It also invalidates all refresh tokens issued to a user. The user's current access and Id tokens remain valid until their expiry. Access and Id tokens expire one hour after they are issued. Calling this action requires developer credentials.
    */
  def adminUserGlobalSignOut(): Request[AdminUserGlobalSignOutResponse, AWSError] = js.native
  def adminUserGlobalSignOut(callback: js.Function2[/* err */ AWSError, /* data */ AdminUserGlobalSignOutResponse, Unit]): Request[AdminUserGlobalSignOutResponse, AWSError] = js.native
  /**
    * Signs out users from all devices, as an administrator. It also invalidates all refresh tokens issued to a user. The user's current access and Id tokens remain valid until their expiry. Access and Id tokens expire one hour after they are issued. Calling this action requires developer credentials.
    */
  def adminUserGlobalSignOut(params: AdminUserGlobalSignOutRequest): Request[AdminUserGlobalSignOutResponse, AWSError] = js.native
  def adminUserGlobalSignOut(
    params: AdminUserGlobalSignOutRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AdminUserGlobalSignOutResponse, Unit]
  ): Request[AdminUserGlobalSignOutResponse, AWSError] = js.native
  /**
    * Returns a unique generated shared secret key code for the user account. The request takes an access token or a session string, but not both.
    */
  def associateSoftwareToken(): Request[AssociateSoftwareTokenResponse, AWSError] = js.native
  def associateSoftwareToken(callback: js.Function2[/* err */ AWSError, /* data */ AssociateSoftwareTokenResponse, Unit]): Request[AssociateSoftwareTokenResponse, AWSError] = js.native
  /**
    * Returns a unique generated shared secret key code for the user account. The request takes an access token or a session string, but not both.
    */
  def associateSoftwareToken(params: AssociateSoftwareTokenRequest): Request[AssociateSoftwareTokenResponse, AWSError] = js.native
  def associateSoftwareToken(
    params: AssociateSoftwareTokenRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateSoftwareTokenResponse, Unit]
  ): Request[AssociateSoftwareTokenResponse, AWSError] = js.native
  /**
    * Changes the password for a specified user in a user pool.
    */
  def changePassword(): Request[ChangePasswordResponse, AWSError] = js.native
  def changePassword(callback: js.Function2[/* err */ AWSError, /* data */ ChangePasswordResponse, Unit]): Request[ChangePasswordResponse, AWSError] = js.native
  /**
    * Changes the password for a specified user in a user pool.
    */
  def changePassword(params: ChangePasswordRequest): Request[ChangePasswordResponse, AWSError] = js.native
  def changePassword(
    params: ChangePasswordRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ChangePasswordResponse, Unit]
  ): Request[ChangePasswordResponse, AWSError] = js.native
  /**
    * Confirms tracking of the device. This API call is the call that begins device tracking.
    */
  def confirmDevice(): Request[ConfirmDeviceResponse, AWSError] = js.native
  def confirmDevice(callback: js.Function2[/* err */ AWSError, /* data */ ConfirmDeviceResponse, Unit]): Request[ConfirmDeviceResponse, AWSError] = js.native
  /**
    * Confirms tracking of the device. This API call is the call that begins device tracking.
    */
  def confirmDevice(params: ConfirmDeviceRequest): Request[ConfirmDeviceResponse, AWSError] = js.native
  def confirmDevice(
    params: ConfirmDeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ConfirmDeviceResponse, Unit]
  ): Request[ConfirmDeviceResponse, AWSError] = js.native
  /**
    * Allows a user to enter a confirmation code to reset a forgotten password.
    */
  def confirmForgotPassword(): Request[ConfirmForgotPasswordResponse, AWSError] = js.native
  def confirmForgotPassword(callback: js.Function2[/* err */ AWSError, /* data */ ConfirmForgotPasswordResponse, Unit]): Request[ConfirmForgotPasswordResponse, AWSError] = js.native
  /**
    * Allows a user to enter a confirmation code to reset a forgotten password.
    */
  def confirmForgotPassword(params: ConfirmForgotPasswordRequest): Request[ConfirmForgotPasswordResponse, AWSError] = js.native
  def confirmForgotPassword(
    params: ConfirmForgotPasswordRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ConfirmForgotPasswordResponse, Unit]
  ): Request[ConfirmForgotPasswordResponse, AWSError] = js.native
  /**
    * Confirms registration of a user and handles the existing alias from a previous user.
    */
  def confirmSignUp(): Request[ConfirmSignUpResponse, AWSError] = js.native
  def confirmSignUp(callback: js.Function2[/* err */ AWSError, /* data */ ConfirmSignUpResponse, Unit]): Request[ConfirmSignUpResponse, AWSError] = js.native
  /**
    * Confirms registration of a user and handles the existing alias from a previous user.
    */
  def confirmSignUp(params: ConfirmSignUpRequest): Request[ConfirmSignUpResponse, AWSError] = js.native
  def confirmSignUp(
    params: ConfirmSignUpRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ConfirmSignUpResponse, Unit]
  ): Request[ConfirmSignUpResponse, AWSError] = js.native
  /**
    * Creates a new group in the specified user pool. Calling this action requires developer credentials.
    */
  def createGroup(): Request[CreateGroupResponse, AWSError] = js.native
  def createGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupResponse, Unit]): Request[CreateGroupResponse, AWSError] = js.native
  /**
    * Creates a new group in the specified user pool. Calling this action requires developer credentials.
    */
  def createGroup(params: CreateGroupRequest): Request[CreateGroupResponse, AWSError] = js.native
  def createGroup(
    params: CreateGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupResponse, Unit]
  ): Request[CreateGroupResponse, AWSError] = js.native
  /**
    * Creates an identity provider for a user pool.
    */
  def createIdentityProvider(): Request[CreateIdentityProviderResponse, AWSError] = js.native
  def createIdentityProvider(callback: js.Function2[/* err */ AWSError, /* data */ CreateIdentityProviderResponse, Unit]): Request[CreateIdentityProviderResponse, AWSError] = js.native
  /**
    * Creates an identity provider for a user pool.
    */
  def createIdentityProvider(params: CreateIdentityProviderRequest): Request[CreateIdentityProviderResponse, AWSError] = js.native
  def createIdentityProvider(
    params: CreateIdentityProviderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateIdentityProviderResponse, Unit]
  ): Request[CreateIdentityProviderResponse, AWSError] = js.native
  /**
    * Creates a new OAuth2.0 resource server and defines custom scopes in it.
    */
  def createResourceServer(): Request[CreateResourceServerResponse, AWSError] = js.native
  def createResourceServer(callback: js.Function2[/* err */ AWSError, /* data */ CreateResourceServerResponse, Unit]): Request[CreateResourceServerResponse, AWSError] = js.native
  /**
    * Creates a new OAuth2.0 resource server and defines custom scopes in it.
    */
  def createResourceServer(params: CreateResourceServerRequest): Request[CreateResourceServerResponse, AWSError] = js.native
  def createResourceServer(
    params: CreateResourceServerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateResourceServerResponse, Unit]
  ): Request[CreateResourceServerResponse, AWSError] = js.native
  /**
    * Creates the user import job.
    */
  def createUserImportJob(): Request[CreateUserImportJobResponse, AWSError] = js.native
  def createUserImportJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateUserImportJobResponse, Unit]): Request[CreateUserImportJobResponse, AWSError] = js.native
  /**
    * Creates the user import job.
    */
  def createUserImportJob(params: CreateUserImportJobRequest): Request[CreateUserImportJobResponse, AWSError] = js.native
  def createUserImportJob(
    params: CreateUserImportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUserImportJobResponse, Unit]
  ): Request[CreateUserImportJobResponse, AWSError] = js.native
  /**
    * Creates a new Amazon Cognito user pool and sets the password policy for the pool.
    */
  def createUserPool(): Request[CreateUserPoolResponse, AWSError] = js.native
  def createUserPool(callback: js.Function2[/* err */ AWSError, /* data */ CreateUserPoolResponse, Unit]): Request[CreateUserPoolResponse, AWSError] = js.native
  /**
    * Creates a new Amazon Cognito user pool and sets the password policy for the pool.
    */
  def createUserPool(params: CreateUserPoolRequest): Request[CreateUserPoolResponse, AWSError] = js.native
  def createUserPool(
    params: CreateUserPoolRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUserPoolResponse, Unit]
  ): Request[CreateUserPoolResponse, AWSError] = js.native
  /**
    * Creates the user pool client.
    */
  def createUserPoolClient(): Request[CreateUserPoolClientResponse, AWSError] = js.native
  def createUserPoolClient(callback: js.Function2[/* err */ AWSError, /* data */ CreateUserPoolClientResponse, Unit]): Request[CreateUserPoolClientResponse, AWSError] = js.native
  /**
    * Creates the user pool client.
    */
  def createUserPoolClient(params: CreateUserPoolClientRequest): Request[CreateUserPoolClientResponse, AWSError] = js.native
  def createUserPoolClient(
    params: CreateUserPoolClientRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUserPoolClientResponse, Unit]
  ): Request[CreateUserPoolClientResponse, AWSError] = js.native
  /**
    * Creates a new domain for a user pool.
    */
  def createUserPoolDomain(): Request[CreateUserPoolDomainResponse, AWSError] = js.native
  def createUserPoolDomain(callback: js.Function2[/* err */ AWSError, /* data */ CreateUserPoolDomainResponse, Unit]): Request[CreateUserPoolDomainResponse, AWSError] = js.native
  /**
    * Creates a new domain for a user pool.
    */
  def createUserPoolDomain(params: CreateUserPoolDomainRequest): Request[CreateUserPoolDomainResponse, AWSError] = js.native
  def createUserPoolDomain(
    params: CreateUserPoolDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUserPoolDomainResponse, Unit]
  ): Request[CreateUserPoolDomainResponse, AWSError] = js.native
  /**
    * Deletes a group. Currently only groups with no members can be deleted. Calling this action requires developer credentials.
    */
  def deleteGroup(): Request[js.Object, AWSError] = js.native
  def deleteGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a group. Currently only groups with no members can be deleted. Calling this action requires developer credentials.
    */
  def deleteGroup(params: DeleteGroupRequest): Request[js.Object, AWSError] = js.native
  def deleteGroup(params: DeleteGroupRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an identity provider for a user pool.
    */
  def deleteIdentityProvider(): Request[js.Object, AWSError] = js.native
  def deleteIdentityProvider(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an identity provider for a user pool.
    */
  def deleteIdentityProvider(params: DeleteIdentityProviderRequest): Request[js.Object, AWSError] = js.native
  def deleteIdentityProvider(
    params: DeleteIdentityProviderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a resource server.
    */
  def deleteResourceServer(): Request[js.Object, AWSError] = js.native
  def deleteResourceServer(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a resource server.
    */
  def deleteResourceServer(params: DeleteResourceServerRequest): Request[js.Object, AWSError] = js.native
  def deleteResourceServer(
    params: DeleteResourceServerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Allows a user to delete himself or herself.
    */
  def deleteUser(): Request[js.Object, AWSError] = js.native
  def deleteUser(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Allows a user to delete himself or herself.
    */
  def deleteUser(params: DeleteUserRequest): Request[js.Object, AWSError] = js.native
  def deleteUser(params: DeleteUserRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the attributes for a user.
    */
  def deleteUserAttributes(): Request[DeleteUserAttributesResponse, AWSError] = js.native
  def deleteUserAttributes(callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserAttributesResponse, Unit]): Request[DeleteUserAttributesResponse, AWSError] = js.native
  /**
    * Deletes the attributes for a user.
    */
  def deleteUserAttributes(params: DeleteUserAttributesRequest): Request[DeleteUserAttributesResponse, AWSError] = js.native
  def deleteUserAttributes(
    params: DeleteUserAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserAttributesResponse, Unit]
  ): Request[DeleteUserAttributesResponse, AWSError] = js.native
  /**
    * Deletes the specified Amazon Cognito user pool.
    */
  def deleteUserPool(): Request[js.Object, AWSError] = js.native
  def deleteUserPool(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified Amazon Cognito user pool.
    */
  def deleteUserPool(params: DeleteUserPoolRequest): Request[js.Object, AWSError] = js.native
  def deleteUserPool(
    params: DeleteUserPoolRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Allows the developer to delete the user pool client.
    */
  def deleteUserPoolClient(): Request[js.Object, AWSError] = js.native
  def deleteUserPoolClient(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Allows the developer to delete the user pool client.
    */
  def deleteUserPoolClient(params: DeleteUserPoolClientRequest): Request[js.Object, AWSError] = js.native
  def deleteUserPoolClient(
    params: DeleteUserPoolClientRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a domain for a user pool.
    */
  def deleteUserPoolDomain(): Request[DeleteUserPoolDomainResponse, AWSError] = js.native
  def deleteUserPoolDomain(callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserPoolDomainResponse, Unit]): Request[DeleteUserPoolDomainResponse, AWSError] = js.native
  /**
    * Deletes a domain for a user pool.
    */
  def deleteUserPoolDomain(params: DeleteUserPoolDomainRequest): Request[DeleteUserPoolDomainResponse, AWSError] = js.native
  def deleteUserPoolDomain(
    params: DeleteUserPoolDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserPoolDomainResponse, Unit]
  ): Request[DeleteUserPoolDomainResponse, AWSError] = js.native
  /**
    * Gets information about a specific identity provider.
    */
  def describeIdentityProvider(): Request[DescribeIdentityProviderResponse, AWSError] = js.native
  def describeIdentityProvider(callback: js.Function2[/* err */ AWSError, /* data */ DescribeIdentityProviderResponse, Unit]): Request[DescribeIdentityProviderResponse, AWSError] = js.native
  /**
    * Gets information about a specific identity provider.
    */
  def describeIdentityProvider(params: DescribeIdentityProviderRequest): Request[DescribeIdentityProviderResponse, AWSError] = js.native
  def describeIdentityProvider(
    params: DescribeIdentityProviderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeIdentityProviderResponse, Unit]
  ): Request[DescribeIdentityProviderResponse, AWSError] = js.native
  /**
    * Describes a resource server.
    */
  def describeResourceServer(): Request[DescribeResourceServerResponse, AWSError] = js.native
  def describeResourceServer(callback: js.Function2[/* err */ AWSError, /* data */ DescribeResourceServerResponse, Unit]): Request[DescribeResourceServerResponse, AWSError] = js.native
  /**
    * Describes a resource server.
    */
  def describeResourceServer(params: DescribeResourceServerRequest): Request[DescribeResourceServerResponse, AWSError] = js.native
  def describeResourceServer(
    params: DescribeResourceServerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeResourceServerResponse, Unit]
  ): Request[DescribeResourceServerResponse, AWSError] = js.native
  /**
    * Describes the risk configuration.
    */
  def describeRiskConfiguration(): Request[DescribeRiskConfigurationResponse, AWSError] = js.native
  def describeRiskConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRiskConfigurationResponse, Unit]): Request[DescribeRiskConfigurationResponse, AWSError] = js.native
  /**
    * Describes the risk configuration.
    */
  def describeRiskConfiguration(params: DescribeRiskConfigurationRequest): Request[DescribeRiskConfigurationResponse, AWSError] = js.native
  def describeRiskConfiguration(
    params: DescribeRiskConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRiskConfigurationResponse, Unit]
  ): Request[DescribeRiskConfigurationResponse, AWSError] = js.native
  /**
    * Describes the user import job.
    */
  def describeUserImportJob(): Request[DescribeUserImportJobResponse, AWSError] = js.native
  def describeUserImportJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserImportJobResponse, Unit]): Request[DescribeUserImportJobResponse, AWSError] = js.native
  /**
    * Describes the user import job.
    */
  def describeUserImportJob(params: DescribeUserImportJobRequest): Request[DescribeUserImportJobResponse, AWSError] = js.native
  def describeUserImportJob(
    params: DescribeUserImportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserImportJobResponse, Unit]
  ): Request[DescribeUserImportJobResponse, AWSError] = js.native
  /**
    * Returns the configuration information and metadata of the specified user pool.
    */
  def describeUserPool(): Request[DescribeUserPoolResponse, AWSError] = js.native
  def describeUserPool(callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserPoolResponse, Unit]): Request[DescribeUserPoolResponse, AWSError] = js.native
  /**
    * Returns the configuration information and metadata of the specified user pool.
    */
  def describeUserPool(params: DescribeUserPoolRequest): Request[DescribeUserPoolResponse, AWSError] = js.native
  def describeUserPool(
    params: DescribeUserPoolRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserPoolResponse, Unit]
  ): Request[DescribeUserPoolResponse, AWSError] = js.native
  /**
    * Client method for returning the configuration information and metadata of the specified user pool app client.
    */
  def describeUserPoolClient(): Request[DescribeUserPoolClientResponse, AWSError] = js.native
  def describeUserPoolClient(callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserPoolClientResponse, Unit]): Request[DescribeUserPoolClientResponse, AWSError] = js.native
  /**
    * Client method for returning the configuration information and metadata of the specified user pool app client.
    */
  def describeUserPoolClient(params: DescribeUserPoolClientRequest): Request[DescribeUserPoolClientResponse, AWSError] = js.native
  def describeUserPoolClient(
    params: DescribeUserPoolClientRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserPoolClientResponse, Unit]
  ): Request[DescribeUserPoolClientResponse, AWSError] = js.native
  /**
    * Gets information about a domain.
    */
  def describeUserPoolDomain(): Request[DescribeUserPoolDomainResponse, AWSError] = js.native
  def describeUserPoolDomain(callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserPoolDomainResponse, Unit]): Request[DescribeUserPoolDomainResponse, AWSError] = js.native
  /**
    * Gets information about a domain.
    */
  def describeUserPoolDomain(params: DescribeUserPoolDomainRequest): Request[DescribeUserPoolDomainResponse, AWSError] = js.native
  def describeUserPoolDomain(
    params: DescribeUserPoolDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserPoolDomainResponse, Unit]
  ): Request[DescribeUserPoolDomainResponse, AWSError] = js.native
  /**
    * Forgets the specified device.
    */
  def forgetDevice(): Request[js.Object, AWSError] = js.native
  def forgetDevice(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Forgets the specified device.
    */
  def forgetDevice(params: ForgetDeviceRequest): Request[js.Object, AWSError] = js.native
  def forgetDevice(
    params: ForgetDeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Calling this API causes a message to be sent to the end user with a confirmation code that is required to change the user's password. For the Username parameter, you can use the username or user alias. The method used to send the confirmation code is sent according to the specified AccountRecoverySetting. For more information, see Recovering User Accounts in the Amazon Cognito Developer Guide. If neither a verified phone number nor a verified email exists, an InvalidParameterException is thrown. To use the confirmation code for resetting the password, call .
    */
  def forgotPassword(): Request[ForgotPasswordResponse, AWSError] = js.native
  def forgotPassword(callback: js.Function2[/* err */ AWSError, /* data */ ForgotPasswordResponse, Unit]): Request[ForgotPasswordResponse, AWSError] = js.native
  /**
    * Calling this API causes a message to be sent to the end user with a confirmation code that is required to change the user's password. For the Username parameter, you can use the username or user alias. The method used to send the confirmation code is sent according to the specified AccountRecoverySetting. For more information, see Recovering User Accounts in the Amazon Cognito Developer Guide. If neither a verified phone number nor a verified email exists, an InvalidParameterException is thrown. To use the confirmation code for resetting the password, call .
    */
  def forgotPassword(params: ForgotPasswordRequest): Request[ForgotPasswordResponse, AWSError] = js.native
  def forgotPassword(
    params: ForgotPasswordRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ForgotPasswordResponse, Unit]
  ): Request[ForgotPasswordResponse, AWSError] = js.native
  /**
    * Gets the header information for the .csv file to be used as input for the user import job.
    */
  def getCSVHeader(): Request[GetCSVHeaderResponse, AWSError] = js.native
  def getCSVHeader(callback: js.Function2[/* err */ AWSError, /* data */ GetCSVHeaderResponse, Unit]): Request[GetCSVHeaderResponse, AWSError] = js.native
  /**
    * Gets the header information for the .csv file to be used as input for the user import job.
    */
  def getCSVHeader(params: GetCSVHeaderRequest): Request[GetCSVHeaderResponse, AWSError] = js.native
  def getCSVHeader(
    params: GetCSVHeaderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCSVHeaderResponse, Unit]
  ): Request[GetCSVHeaderResponse, AWSError] = js.native
  /**
    * Gets the device.
    */
  def getDevice(): Request[GetDeviceResponse, AWSError] = js.native
  def getDevice(callback: js.Function2[/* err */ AWSError, /* data */ GetDeviceResponse, Unit]): Request[GetDeviceResponse, AWSError] = js.native
  /**
    * Gets the device.
    */
  def getDevice(params: GetDeviceRequest): Request[GetDeviceResponse, AWSError] = js.native
  def getDevice(
    params: GetDeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDeviceResponse, Unit]
  ): Request[GetDeviceResponse, AWSError] = js.native
  /**
    * Gets a group. Calling this action requires developer credentials.
    */
  def getGroup(): Request[GetGroupResponse, AWSError] = js.native
  def getGroup(callback: js.Function2[/* err */ AWSError, /* data */ GetGroupResponse, Unit]): Request[GetGroupResponse, AWSError] = js.native
  /**
    * Gets a group. Calling this action requires developer credentials.
    */
  def getGroup(params: GetGroupRequest): Request[GetGroupResponse, AWSError] = js.native
  def getGroup(
    params: GetGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetGroupResponse, Unit]
  ): Request[GetGroupResponse, AWSError] = js.native
  /**
    * Gets the specified identity provider.
    */
  def getIdentityProviderByIdentifier(): Request[GetIdentityProviderByIdentifierResponse, AWSError] = js.native
  def getIdentityProviderByIdentifier(
    callback: js.Function2[/* err */ AWSError, /* data */ GetIdentityProviderByIdentifierResponse, Unit]
  ): Request[GetIdentityProviderByIdentifierResponse, AWSError] = js.native
  /**
    * Gets the specified identity provider.
    */
  def getIdentityProviderByIdentifier(params: GetIdentityProviderByIdentifierRequest): Request[GetIdentityProviderByIdentifierResponse, AWSError] = js.native
  def getIdentityProviderByIdentifier(
    params: GetIdentityProviderByIdentifierRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetIdentityProviderByIdentifierResponse, Unit]
  ): Request[GetIdentityProviderByIdentifierResponse, AWSError] = js.native
  /**
    * This method takes a user pool ID, and returns the signing certificate.
    */
  def getSigningCertificate(): Request[GetSigningCertificateResponse, AWSError] = js.native
  def getSigningCertificate(callback: js.Function2[/* err */ AWSError, /* data */ GetSigningCertificateResponse, Unit]): Request[GetSigningCertificateResponse, AWSError] = js.native
  /**
    * This method takes a user pool ID, and returns the signing certificate.
    */
  def getSigningCertificate(params: GetSigningCertificateRequest): Request[GetSigningCertificateResponse, AWSError] = js.native
  def getSigningCertificate(
    params: GetSigningCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSigningCertificateResponse, Unit]
  ): Request[GetSigningCertificateResponse, AWSError] = js.native
  /**
    * Gets the UI Customization information for a particular app client's app UI, if there is something set. If nothing is set for the particular client, but there is an existing pool level customization (app clientId will be ALL), then that is returned. If nothing is present, then an empty shape is returned.
    */
  def getUICustomization(): Request[GetUICustomizationResponse, AWSError] = js.native
  def getUICustomization(callback: js.Function2[/* err */ AWSError, /* data */ GetUICustomizationResponse, Unit]): Request[GetUICustomizationResponse, AWSError] = js.native
  /**
    * Gets the UI Customization information for a particular app client's app UI, if there is something set. If nothing is set for the particular client, but there is an existing pool level customization (app clientId will be ALL), then that is returned. If nothing is present, then an empty shape is returned.
    */
  def getUICustomization(params: GetUICustomizationRequest): Request[GetUICustomizationResponse, AWSError] = js.native
  def getUICustomization(
    params: GetUICustomizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetUICustomizationResponse, Unit]
  ): Request[GetUICustomizationResponse, AWSError] = js.native
  /**
    * Gets the user attributes and metadata for a user.
    */
  def getUser(): Request[GetUserResponse, AWSError] = js.native
  def getUser(callback: js.Function2[/* err */ AWSError, /* data */ GetUserResponse, Unit]): Request[GetUserResponse, AWSError] = js.native
  /**
    * Gets the user attributes and metadata for a user.
    */
  def getUser(params: GetUserRequest): Request[GetUserResponse, AWSError] = js.native
  def getUser(
    params: GetUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetUserResponse, Unit]
  ): Request[GetUserResponse, AWSError] = js.native
  /**
    * Gets the user attribute verification code for the specified attribute name.
    */
  def getUserAttributeVerificationCode(): Request[GetUserAttributeVerificationCodeResponse, AWSError] = js.native
  def getUserAttributeVerificationCode(
    callback: js.Function2[/* err */ AWSError, /* data */ GetUserAttributeVerificationCodeResponse, Unit]
  ): Request[GetUserAttributeVerificationCodeResponse, AWSError] = js.native
  /**
    * Gets the user attribute verification code for the specified attribute name.
    */
  def getUserAttributeVerificationCode(params: GetUserAttributeVerificationCodeRequest): Request[GetUserAttributeVerificationCodeResponse, AWSError] = js.native
  def getUserAttributeVerificationCode(
    params: GetUserAttributeVerificationCodeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetUserAttributeVerificationCodeResponse, Unit]
  ): Request[GetUserAttributeVerificationCodeResponse, AWSError] = js.native
  /**
    * Gets the user pool multi-factor authentication (MFA) configuration.
    */
  def getUserPoolMfaConfig(): Request[GetUserPoolMfaConfigResponse, AWSError] = js.native
  def getUserPoolMfaConfig(callback: js.Function2[/* err */ AWSError, /* data */ GetUserPoolMfaConfigResponse, Unit]): Request[GetUserPoolMfaConfigResponse, AWSError] = js.native
  /**
    * Gets the user pool multi-factor authentication (MFA) configuration.
    */
  def getUserPoolMfaConfig(params: GetUserPoolMfaConfigRequest): Request[GetUserPoolMfaConfigResponse, AWSError] = js.native
  def getUserPoolMfaConfig(
    params: GetUserPoolMfaConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetUserPoolMfaConfigResponse, Unit]
  ): Request[GetUserPoolMfaConfigResponse, AWSError] = js.native
  /**
    * Signs out users from all devices. It also invalidates all refresh tokens issued to a user. The user's current access and Id tokens remain valid until their expiry. Access and Id tokens expire one hour after they are issued.
    */
  def globalSignOut(): Request[GlobalSignOutResponse, AWSError] = js.native
  def globalSignOut(callback: js.Function2[/* err */ AWSError, /* data */ GlobalSignOutResponse, Unit]): Request[GlobalSignOutResponse, AWSError] = js.native
  /**
    * Signs out users from all devices. It also invalidates all refresh tokens issued to a user. The user's current access and Id tokens remain valid until their expiry. Access and Id tokens expire one hour after they are issued.
    */
  def globalSignOut(params: GlobalSignOutRequest): Request[GlobalSignOutResponse, AWSError] = js.native
  def globalSignOut(
    params: GlobalSignOutRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GlobalSignOutResponse, Unit]
  ): Request[GlobalSignOutResponse, AWSError] = js.native
  /**
    * Initiates the authentication flow.
    */
  def initiateAuth(): Request[InitiateAuthResponse, AWSError] = js.native
  def initiateAuth(callback: js.Function2[/* err */ AWSError, /* data */ InitiateAuthResponse, Unit]): Request[InitiateAuthResponse, AWSError] = js.native
  /**
    * Initiates the authentication flow.
    */
  def initiateAuth(params: InitiateAuthRequest): Request[InitiateAuthResponse, AWSError] = js.native
  def initiateAuth(
    params: InitiateAuthRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ InitiateAuthResponse, Unit]
  ): Request[InitiateAuthResponse, AWSError] = js.native
  /**
    * Lists the devices.
    */
  def listDevices(): Request[ListDevicesResponse, AWSError] = js.native
  def listDevices(callback: js.Function2[/* err */ AWSError, /* data */ ListDevicesResponse, Unit]): Request[ListDevicesResponse, AWSError] = js.native
  /**
    * Lists the devices.
    */
  def listDevices(params: ListDevicesRequest): Request[ListDevicesResponse, AWSError] = js.native
  def listDevices(
    params: ListDevicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDevicesResponse, Unit]
  ): Request[ListDevicesResponse, AWSError] = js.native
  /**
    * Lists the groups associated with a user pool. Calling this action requires developer credentials.
    */
  def listGroups(): Request[ListGroupsResponse, AWSError] = js.native
  def listGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListGroupsResponse, Unit]): Request[ListGroupsResponse, AWSError] = js.native
  /**
    * Lists the groups associated with a user pool. Calling this action requires developer credentials.
    */
  def listGroups(params: ListGroupsRequest): Request[ListGroupsResponse, AWSError] = js.native
  def listGroups(
    params: ListGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGroupsResponse, Unit]
  ): Request[ListGroupsResponse, AWSError] = js.native
  /**
    * Lists information about all identity providers for a user pool.
    */
  def listIdentityProviders(): Request[ListIdentityProvidersResponse, AWSError] = js.native
  def listIdentityProviders(callback: js.Function2[/* err */ AWSError, /* data */ ListIdentityProvidersResponse, Unit]): Request[ListIdentityProvidersResponse, AWSError] = js.native
  /**
    * Lists information about all identity providers for a user pool.
    */
  def listIdentityProviders(params: ListIdentityProvidersRequest): Request[ListIdentityProvidersResponse, AWSError] = js.native
  def listIdentityProviders(
    params: ListIdentityProvidersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListIdentityProvidersResponse, Unit]
  ): Request[ListIdentityProvidersResponse, AWSError] = js.native
  /**
    * Lists the resource servers for a user pool.
    */
  def listResourceServers(): Request[ListResourceServersResponse, AWSError] = js.native
  def listResourceServers(callback: js.Function2[/* err */ AWSError, /* data */ ListResourceServersResponse, Unit]): Request[ListResourceServersResponse, AWSError] = js.native
  /**
    * Lists the resource servers for a user pool.
    */
  def listResourceServers(params: ListResourceServersRequest): Request[ListResourceServersResponse, AWSError] = js.native
  def listResourceServers(
    params: ListResourceServersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourceServersResponse, Unit]
  ): Request[ListResourceServersResponse, AWSError] = js.native
  /**
    * Lists the tags that are assigned to an Amazon Cognito user pool. A tag is a label that you can apply to user pools to categorize and manage them in different ways, such as by purpose, owner, environment, or other criteria. You can use this action up to 10 times per second, per account.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags that are assigned to an Amazon Cognito user pool. A tag is a label that you can apply to user pools to categorize and manage them in different ways, such as by purpose, owner, environment, or other criteria. You can use this action up to 10 times per second, per account.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the user import jobs.
    */
  def listUserImportJobs(): Request[ListUserImportJobsResponse, AWSError] = js.native
  def listUserImportJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListUserImportJobsResponse, Unit]): Request[ListUserImportJobsResponse, AWSError] = js.native
  /**
    * Lists the user import jobs.
    */
  def listUserImportJobs(params: ListUserImportJobsRequest): Request[ListUserImportJobsResponse, AWSError] = js.native
  def listUserImportJobs(
    params: ListUserImportJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUserImportJobsResponse, Unit]
  ): Request[ListUserImportJobsResponse, AWSError] = js.native
  /**
    * Lists the clients that have been created for the specified user pool.
    */
  def listUserPoolClients(): Request[ListUserPoolClientsResponse, AWSError] = js.native
  def listUserPoolClients(callback: js.Function2[/* err */ AWSError, /* data */ ListUserPoolClientsResponse, Unit]): Request[ListUserPoolClientsResponse, AWSError] = js.native
  /**
    * Lists the clients that have been created for the specified user pool.
    */
  def listUserPoolClients(params: ListUserPoolClientsRequest): Request[ListUserPoolClientsResponse, AWSError] = js.native
  def listUserPoolClients(
    params: ListUserPoolClientsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUserPoolClientsResponse, Unit]
  ): Request[ListUserPoolClientsResponse, AWSError] = js.native
  /**
    * Lists the user pools associated with an AWS account.
    */
  def listUserPools(): Request[ListUserPoolsResponse, AWSError] = js.native
  def listUserPools(callback: js.Function2[/* err */ AWSError, /* data */ ListUserPoolsResponse, Unit]): Request[ListUserPoolsResponse, AWSError] = js.native
  /**
    * Lists the user pools associated with an AWS account.
    */
  def listUserPools(params: ListUserPoolsRequest): Request[ListUserPoolsResponse, AWSError] = js.native
  def listUserPools(
    params: ListUserPoolsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUserPoolsResponse, Unit]
  ): Request[ListUserPoolsResponse, AWSError] = js.native
  /**
    * Lists the users in the Amazon Cognito user pool.
    */
  def listUsers(): Request[ListUsersResponse, AWSError] = js.native
  def listUsers(callback: js.Function2[/* err */ AWSError, /* data */ ListUsersResponse, Unit]): Request[ListUsersResponse, AWSError] = js.native
  /**
    * Lists the users in the Amazon Cognito user pool.
    */
  def listUsers(params: ListUsersRequest): Request[ListUsersResponse, AWSError] = js.native
  def listUsers(
    params: ListUsersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUsersResponse, Unit]
  ): Request[ListUsersResponse, AWSError] = js.native
  /**
    * Lists the users in the specified group. Calling this action requires developer credentials.
    */
  def listUsersInGroup(): Request[ListUsersInGroupResponse, AWSError] = js.native
  def listUsersInGroup(callback: js.Function2[/* err */ AWSError, /* data */ ListUsersInGroupResponse, Unit]): Request[ListUsersInGroupResponse, AWSError] = js.native
  /**
    * Lists the users in the specified group. Calling this action requires developer credentials.
    */
  def listUsersInGroup(params: ListUsersInGroupRequest): Request[ListUsersInGroupResponse, AWSError] = js.native
  def listUsersInGroup(
    params: ListUsersInGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUsersInGroupResponse, Unit]
  ): Request[ListUsersInGroupResponse, AWSError] = js.native
  /**
    * Resends the confirmation (for confirmation of registration) to a specific user in the user pool.
    */
  def resendConfirmationCode(): Request[ResendConfirmationCodeResponse, AWSError] = js.native
  def resendConfirmationCode(callback: js.Function2[/* err */ AWSError, /* data */ ResendConfirmationCodeResponse, Unit]): Request[ResendConfirmationCodeResponse, AWSError] = js.native
  /**
    * Resends the confirmation (for confirmation of registration) to a specific user in the user pool.
    */
  def resendConfirmationCode(params: ResendConfirmationCodeRequest): Request[ResendConfirmationCodeResponse, AWSError] = js.native
  def resendConfirmationCode(
    params: ResendConfirmationCodeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ResendConfirmationCodeResponse, Unit]
  ): Request[ResendConfirmationCodeResponse, AWSError] = js.native
  /**
    * Responds to the authentication challenge.
    */
  def respondToAuthChallenge(): Request[RespondToAuthChallengeResponse, AWSError] = js.native
  def respondToAuthChallenge(callback: js.Function2[/* err */ AWSError, /* data */ RespondToAuthChallengeResponse, Unit]): Request[RespondToAuthChallengeResponse, AWSError] = js.native
  /**
    * Responds to the authentication challenge.
    */
  def respondToAuthChallenge(params: RespondToAuthChallengeRequest): Request[RespondToAuthChallengeResponse, AWSError] = js.native
  def respondToAuthChallenge(
    params: RespondToAuthChallengeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RespondToAuthChallengeResponse, Unit]
  ): Request[RespondToAuthChallengeResponse, AWSError] = js.native
  /**
    * Configures actions on detected risks. To delete the risk configuration for UserPoolId or ClientId, pass null values for all four configuration types. To enable Amazon Cognito advanced security features, update the user pool to include the UserPoolAddOns keyAdvancedSecurityMode. See .
    */
  def setRiskConfiguration(): Request[SetRiskConfigurationResponse, AWSError] = js.native
  def setRiskConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ SetRiskConfigurationResponse, Unit]): Request[SetRiskConfigurationResponse, AWSError] = js.native
  /**
    * Configures actions on detected risks. To delete the risk configuration for UserPoolId or ClientId, pass null values for all four configuration types. To enable Amazon Cognito advanced security features, update the user pool to include the UserPoolAddOns keyAdvancedSecurityMode. See .
    */
  def setRiskConfiguration(params: SetRiskConfigurationRequest): Request[SetRiskConfigurationResponse, AWSError] = js.native
  def setRiskConfiguration(
    params: SetRiskConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SetRiskConfigurationResponse, Unit]
  ): Request[SetRiskConfigurationResponse, AWSError] = js.native
  /**
    * Sets the UI customization information for a user pool's built-in app UI. You can specify app UI customization settings for a single client (with a specific clientId) or for all clients (by setting the clientId to ALL). If you specify ALL, the default configuration will be used for every client that has no UI customization set previously. If you specify UI customization settings for a particular client, it will no longer fall back to the ALL configuration.   To use this API, your user pool must have a domain associated with it. Otherwise, there is no place to host the app's pages, and the service will throw an error. 
    */
  def setUICustomization(): Request[SetUICustomizationResponse, AWSError] = js.native
  def setUICustomization(callback: js.Function2[/* err */ AWSError, /* data */ SetUICustomizationResponse, Unit]): Request[SetUICustomizationResponse, AWSError] = js.native
  /**
    * Sets the UI customization information for a user pool's built-in app UI. You can specify app UI customization settings for a single client (with a specific clientId) or for all clients (by setting the clientId to ALL). If you specify ALL, the default configuration will be used for every client that has no UI customization set previously. If you specify UI customization settings for a particular client, it will no longer fall back to the ALL configuration.   To use this API, your user pool must have a domain associated with it. Otherwise, there is no place to host the app's pages, and the service will throw an error. 
    */
  def setUICustomization(params: SetUICustomizationRequest): Request[SetUICustomizationResponse, AWSError] = js.native
  def setUICustomization(
    params: SetUICustomizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SetUICustomizationResponse, Unit]
  ): Request[SetUICustomizationResponse, AWSError] = js.native
  /**
    * Set the user's multi-factor authentication (MFA) method preference, including which MFA factors are enabled and if any are preferred. Only one factor can be set as preferred. The preferred MFA factor will be used to authenticate a user if multiple factors are enabled. If multiple options are enabled and no preference is set, a challenge to choose an MFA option will be returned during sign in.
    */
  def setUserMFAPreference(): Request[SetUserMFAPreferenceResponse, AWSError] = js.native
  def setUserMFAPreference(callback: js.Function2[/* err */ AWSError, /* data */ SetUserMFAPreferenceResponse, Unit]): Request[SetUserMFAPreferenceResponse, AWSError] = js.native
  /**
    * Set the user's multi-factor authentication (MFA) method preference, including which MFA factors are enabled and if any are preferred. Only one factor can be set as preferred. The preferred MFA factor will be used to authenticate a user if multiple factors are enabled. If multiple options are enabled and no preference is set, a challenge to choose an MFA option will be returned during sign in.
    */
  def setUserMFAPreference(params: SetUserMFAPreferenceRequest): Request[SetUserMFAPreferenceResponse, AWSError] = js.native
  def setUserMFAPreference(
    params: SetUserMFAPreferenceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SetUserMFAPreferenceResponse, Unit]
  ): Request[SetUserMFAPreferenceResponse, AWSError] = js.native
  /**
    * Set the user pool multi-factor authentication (MFA) configuration.
    */
  def setUserPoolMfaConfig(): Request[SetUserPoolMfaConfigResponse, AWSError] = js.native
  def setUserPoolMfaConfig(callback: js.Function2[/* err */ AWSError, /* data */ SetUserPoolMfaConfigResponse, Unit]): Request[SetUserPoolMfaConfigResponse, AWSError] = js.native
  /**
    * Set the user pool multi-factor authentication (MFA) configuration.
    */
  def setUserPoolMfaConfig(params: SetUserPoolMfaConfigRequest): Request[SetUserPoolMfaConfigResponse, AWSError] = js.native
  def setUserPoolMfaConfig(
    params: SetUserPoolMfaConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SetUserPoolMfaConfigResponse, Unit]
  ): Request[SetUserPoolMfaConfigResponse, AWSError] = js.native
  /**
    *  This action is no longer supported. You can use it to configure only SMS MFA. You can't use it to configure TOTP software token MFA. To configure either type of MFA, use the SetUserMFAPreference action instead.
    */
  def setUserSettings(): Request[SetUserSettingsResponse, AWSError] = js.native
  def setUserSettings(callback: js.Function2[/* err */ AWSError, /* data */ SetUserSettingsResponse, Unit]): Request[SetUserSettingsResponse, AWSError] = js.native
  /**
    *  This action is no longer supported. You can use it to configure only SMS MFA. You can't use it to configure TOTP software token MFA. To configure either type of MFA, use the SetUserMFAPreference action instead.
    */
  def setUserSettings(params: SetUserSettingsRequest): Request[SetUserSettingsResponse, AWSError] = js.native
  def setUserSettings(
    params: SetUserSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SetUserSettingsResponse, Unit]
  ): Request[SetUserSettingsResponse, AWSError] = js.native
  /**
    * Registers the user in the specified user pool and creates a user name, password, and user attributes.
    */
  def signUp(): Request[SignUpResponse, AWSError] = js.native
  def signUp(callback: js.Function2[/* err */ AWSError, /* data */ SignUpResponse, Unit]): Request[SignUpResponse, AWSError] = js.native
  /**
    * Registers the user in the specified user pool and creates a user name, password, and user attributes.
    */
  def signUp(params: SignUpRequest): Request[SignUpResponse, AWSError] = js.native
  def signUp(params: SignUpRequest, callback: js.Function2[/* err */ AWSError, /* data */ SignUpResponse, Unit]): Request[SignUpResponse, AWSError] = js.native
  /**
    * Starts the user import.
    */
  def startUserImportJob(): Request[StartUserImportJobResponse, AWSError] = js.native
  def startUserImportJob(callback: js.Function2[/* err */ AWSError, /* data */ StartUserImportJobResponse, Unit]): Request[StartUserImportJobResponse, AWSError] = js.native
  /**
    * Starts the user import.
    */
  def startUserImportJob(params: StartUserImportJobRequest): Request[StartUserImportJobResponse, AWSError] = js.native
  def startUserImportJob(
    params: StartUserImportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartUserImportJobResponse, Unit]
  ): Request[StartUserImportJobResponse, AWSError] = js.native
  /**
    * Stops the user import job.
    */
  def stopUserImportJob(): Request[StopUserImportJobResponse, AWSError] = js.native
  def stopUserImportJob(callback: js.Function2[/* err */ AWSError, /* data */ StopUserImportJobResponse, Unit]): Request[StopUserImportJobResponse, AWSError] = js.native
  /**
    * Stops the user import job.
    */
  def stopUserImportJob(params: StopUserImportJobRequest): Request[StopUserImportJobResponse, AWSError] = js.native
  def stopUserImportJob(
    params: StopUserImportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopUserImportJobResponse, Unit]
  ): Request[StopUserImportJobResponse, AWSError] = js.native
  /**
    * Assigns a set of tags to an Amazon Cognito user pool. A tag is a label that you can use to categorize and manage user pools in different ways, such as by purpose, owner, environment, or other criteria. Each tag consists of a key and value, both of which you define. A key is a general category for more specific values. For example, if you have two versions of a user pool, one for testing and another for production, you might assign an Environment tag key to both user pools. The value of this key might be Test for one user pool and Production for the other. Tags are useful for cost tracking and access control. You can activate your tags so that they appear on the Billing and Cost Management console, where you can track the costs associated with your user pools. In an IAM policy, you can constrain permissions for user pools based on specific tags or tag values. You can use this action up to 5 times per second, per account. A user pool can have as many as 50 tags.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Assigns a set of tags to an Amazon Cognito user pool. A tag is a label that you can use to categorize and manage user pools in different ways, such as by purpose, owner, environment, or other criteria. Each tag consists of a key and value, both of which you define. A key is a general category for more specific values. For example, if you have two versions of a user pool, one for testing and another for production, you might assign an Environment tag key to both user pools. The value of this key might be Test for one user pool and Production for the other. Tags are useful for cost tracking and access control. You can activate your tags so that they appear on the Billing and Cost Management console, where you can track the costs associated with your user pools. In an IAM policy, you can constrain permissions for user pools based on specific tags or tag values. You can use this action up to 5 times per second, per account. A user pool can have as many as 50 tags.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Removes the specified tags from an Amazon Cognito user pool. You can use this action up to 5 times per second, per account
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes the specified tags from an Amazon Cognito user pool. You can use this action up to 5 times per second, per account
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Provides the feedback for an authentication event whether it was from a valid user or not. This feedback is used for improving the risk evaluation decision for the user pool as part of Amazon Cognito advanced security.
    */
  def updateAuthEventFeedback(): Request[UpdateAuthEventFeedbackResponse, AWSError] = js.native
  def updateAuthEventFeedback(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAuthEventFeedbackResponse, Unit]): Request[UpdateAuthEventFeedbackResponse, AWSError] = js.native
  /**
    * Provides the feedback for an authentication event whether it was from a valid user or not. This feedback is used for improving the risk evaluation decision for the user pool as part of Amazon Cognito advanced security.
    */
  def updateAuthEventFeedback(params: UpdateAuthEventFeedbackRequest): Request[UpdateAuthEventFeedbackResponse, AWSError] = js.native
  def updateAuthEventFeedback(
    params: UpdateAuthEventFeedbackRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAuthEventFeedbackResponse, Unit]
  ): Request[UpdateAuthEventFeedbackResponse, AWSError] = js.native
  /**
    * Updates the device status.
    */
  def updateDeviceStatus(): Request[UpdateDeviceStatusResponse, AWSError] = js.native
  def updateDeviceStatus(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDeviceStatusResponse, Unit]): Request[UpdateDeviceStatusResponse, AWSError] = js.native
  /**
    * Updates the device status.
    */
  def updateDeviceStatus(params: UpdateDeviceStatusRequest): Request[UpdateDeviceStatusResponse, AWSError] = js.native
  def updateDeviceStatus(
    params: UpdateDeviceStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDeviceStatusResponse, Unit]
  ): Request[UpdateDeviceStatusResponse, AWSError] = js.native
  /**
    * Updates the specified group with the specified attributes. Calling this action requires developer credentials.  If you don't provide a value for an attribute, it will be set to the default value. 
    */
  def updateGroup(): Request[UpdateGroupResponse, AWSError] = js.native
  def updateGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateGroupResponse, Unit]): Request[UpdateGroupResponse, AWSError] = js.native
  /**
    * Updates the specified group with the specified attributes. Calling this action requires developer credentials.  If you don't provide a value for an attribute, it will be set to the default value. 
    */
  def updateGroup(params: UpdateGroupRequest): Request[UpdateGroupResponse, AWSError] = js.native
  def updateGroup(
    params: UpdateGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateGroupResponse, Unit]
  ): Request[UpdateGroupResponse, AWSError] = js.native
  /**
    * Updates identity provider information for a user pool.
    */
  def updateIdentityProvider(): Request[UpdateIdentityProviderResponse, AWSError] = js.native
  def updateIdentityProvider(callback: js.Function2[/* err */ AWSError, /* data */ UpdateIdentityProviderResponse, Unit]): Request[UpdateIdentityProviderResponse, AWSError] = js.native
  /**
    * Updates identity provider information for a user pool.
    */
  def updateIdentityProvider(params: UpdateIdentityProviderRequest): Request[UpdateIdentityProviderResponse, AWSError] = js.native
  def updateIdentityProvider(
    params: UpdateIdentityProviderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateIdentityProviderResponse, Unit]
  ): Request[UpdateIdentityProviderResponse, AWSError] = js.native
  /**
    * Updates the name and scopes of resource server. All other fields are read-only.  If you don't provide a value for an attribute, it will be set to the default value. 
    */
  def updateResourceServer(): Request[UpdateResourceServerResponse, AWSError] = js.native
  def updateResourceServer(callback: js.Function2[/* err */ AWSError, /* data */ UpdateResourceServerResponse, Unit]): Request[UpdateResourceServerResponse, AWSError] = js.native
  /**
    * Updates the name and scopes of resource server. All other fields are read-only.  If you don't provide a value for an attribute, it will be set to the default value. 
    */
  def updateResourceServer(params: UpdateResourceServerRequest): Request[UpdateResourceServerResponse, AWSError] = js.native
  def updateResourceServer(
    params: UpdateResourceServerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateResourceServerResponse, Unit]
  ): Request[UpdateResourceServerResponse, AWSError] = js.native
  /**
    * Allows a user to update a specific attribute (one at a time).
    */
  def updateUserAttributes(): Request[UpdateUserAttributesResponse, AWSError] = js.native
  def updateUserAttributes(callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserAttributesResponse, Unit]): Request[UpdateUserAttributesResponse, AWSError] = js.native
  /**
    * Allows a user to update a specific attribute (one at a time).
    */
  def updateUserAttributes(params: UpdateUserAttributesRequest): Request[UpdateUserAttributesResponse, AWSError] = js.native
  def updateUserAttributes(
    params: UpdateUserAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserAttributesResponse, Unit]
  ): Request[UpdateUserAttributesResponse, AWSError] = js.native
  /**
    * Updates the specified user pool with the specified attributes. You can get a list of the current user pool settings with .  If you don't provide a value for an attribute, it will be set to the default value. 
    */
  def updateUserPool(): Request[UpdateUserPoolResponse, AWSError] = js.native
  def updateUserPool(callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserPoolResponse, Unit]): Request[UpdateUserPoolResponse, AWSError] = js.native
  /**
    * Updates the specified user pool with the specified attributes. You can get a list of the current user pool settings with .  If you don't provide a value for an attribute, it will be set to the default value. 
    */
  def updateUserPool(params: UpdateUserPoolRequest): Request[UpdateUserPoolResponse, AWSError] = js.native
  def updateUserPool(
    params: UpdateUserPoolRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserPoolResponse, Unit]
  ): Request[UpdateUserPoolResponse, AWSError] = js.native
  /**
    * Updates the specified user pool app client with the specified attributes. You can get a list of the current user pool app client settings with .  If you don't provide a value for an attribute, it will be set to the default value. 
    */
  def updateUserPoolClient(): Request[UpdateUserPoolClientResponse, AWSError] = js.native
  def updateUserPoolClient(callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserPoolClientResponse, Unit]): Request[UpdateUserPoolClientResponse, AWSError] = js.native
  /**
    * Updates the specified user pool app client with the specified attributes. You can get a list of the current user pool app client settings with .  If you don't provide a value for an attribute, it will be set to the default value. 
    */
  def updateUserPoolClient(params: UpdateUserPoolClientRequest): Request[UpdateUserPoolClientResponse, AWSError] = js.native
  def updateUserPoolClient(
    params: UpdateUserPoolClientRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserPoolClientResponse, Unit]
  ): Request[UpdateUserPoolClientResponse, AWSError] = js.native
  /**
    * Updates the Secure Sockets Layer (SSL) certificate for the custom domain for your user pool. You can use this operation to provide the Amazon Resource Name (ARN) of a new certificate to Amazon Cognito. You cannot use it to change the domain for a user pool. A custom domain is used to host the Amazon Cognito hosted UI, which provides sign-up and sign-in pages for your application. When you set up a custom domain, you provide a certificate that you manage with AWS Certificate Manager (ACM). When necessary, you can use this operation to change the certificate that you applied to your custom domain. Usually, this is unnecessary following routine certificate renewal with ACM. When you renew your existing certificate in ACM, the ARN for your certificate remains the same, and your custom domain uses the new certificate automatically. However, if you replace your existing certificate with a new one, ACM gives the new certificate a new ARN. To apply the new certificate to your custom domain, you must provide this ARN to Amazon Cognito. When you add your new certificate in ACM, you must choose US East (N. Virginia) as the AWS Region. After you submit your request, Amazon Cognito requires up to 1 hour to distribute your new certificate to your custom domain. For more information about adding a custom domain to your user pool, see Using Your Own Domain for the Hosted UI.
    */
  def updateUserPoolDomain(): Request[UpdateUserPoolDomainResponse, AWSError] = js.native
  def updateUserPoolDomain(callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserPoolDomainResponse, Unit]): Request[UpdateUserPoolDomainResponse, AWSError] = js.native
  /**
    * Updates the Secure Sockets Layer (SSL) certificate for the custom domain for your user pool. You can use this operation to provide the Amazon Resource Name (ARN) of a new certificate to Amazon Cognito. You cannot use it to change the domain for a user pool. A custom domain is used to host the Amazon Cognito hosted UI, which provides sign-up and sign-in pages for your application. When you set up a custom domain, you provide a certificate that you manage with AWS Certificate Manager (ACM). When necessary, you can use this operation to change the certificate that you applied to your custom domain. Usually, this is unnecessary following routine certificate renewal with ACM. When you renew your existing certificate in ACM, the ARN for your certificate remains the same, and your custom domain uses the new certificate automatically. However, if you replace your existing certificate with a new one, ACM gives the new certificate a new ARN. To apply the new certificate to your custom domain, you must provide this ARN to Amazon Cognito. When you add your new certificate in ACM, you must choose US East (N. Virginia) as the AWS Region. After you submit your request, Amazon Cognito requires up to 1 hour to distribute your new certificate to your custom domain. For more information about adding a custom domain to your user pool, see Using Your Own Domain for the Hosted UI.
    */
  def updateUserPoolDomain(params: UpdateUserPoolDomainRequest): Request[UpdateUserPoolDomainResponse, AWSError] = js.native
  def updateUserPoolDomain(
    params: UpdateUserPoolDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserPoolDomainResponse, Unit]
  ): Request[UpdateUserPoolDomainResponse, AWSError] = js.native
  /**
    * Use this API to register a user's entered TOTP code and mark the user's software token MFA status as "verified" if successful. The request takes an access token or a session string, but not both.
    */
  def verifySoftwareToken(): Request[VerifySoftwareTokenResponse, AWSError] = js.native
  def verifySoftwareToken(callback: js.Function2[/* err */ AWSError, /* data */ VerifySoftwareTokenResponse, Unit]): Request[VerifySoftwareTokenResponse, AWSError] = js.native
  /**
    * Use this API to register a user's entered TOTP code and mark the user's software token MFA status as "verified" if successful. The request takes an access token or a session string, but not both.
    */
  def verifySoftwareToken(params: VerifySoftwareTokenRequest): Request[VerifySoftwareTokenResponse, AWSError] = js.native
  def verifySoftwareToken(
    params: VerifySoftwareTokenRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ VerifySoftwareTokenResponse, Unit]
  ): Request[VerifySoftwareTokenResponse, AWSError] = js.native
  /**
    * Verifies the specified user attributes in the user pool.
    */
  def verifyUserAttribute(): Request[VerifyUserAttributeResponse, AWSError] = js.native
  def verifyUserAttribute(callback: js.Function2[/* err */ AWSError, /* data */ VerifyUserAttributeResponse, Unit]): Request[VerifyUserAttributeResponse, AWSError] = js.native
  /**
    * Verifies the specified user attributes in the user pool.
    */
  def verifyUserAttribute(params: VerifyUserAttributeRequest): Request[VerifyUserAttributeResponse, AWSError] = js.native
  def verifyUserAttribute(
    params: VerifyUserAttributeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ VerifyUserAttributeResponse, Unit]
  ): Request[VerifyUserAttributeResponse, AWSError] = js.native
}

